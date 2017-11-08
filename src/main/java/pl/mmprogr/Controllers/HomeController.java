package pl.mmprogr.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pl.mmprogr.Reviews.Services.ReviewService;
import pl.mmprogr.Reviews.Services.ReviewsSorting;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by ggere on 15.10.2017.
 */
@Controller
public class HomeController {
	private final ReviewService reviewService;

	@Autowired
	public HomeController(ReviewService reviewService) {
		this.reviewService = reviewService;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model, HttpServletRequest request){
		UserDetails userDetails = (UserDetails) request.getUserPrincipal();
		if(userDetails!= null){
			model.addAttribute("user", userDetails);
		}
		return "index";
	}

	// Ajax endpoint
	@RequestMapping(value = "/sorting-reviews", method = RequestMethod.GET)
	public String sortReviews(@RequestParam(value = "sorting", required=false) String sorting, Model model, HttpServletRequest request) {
		ReviewsSorting reviewsSorting = ReviewsSorting.NEWEST;

		switch (sorting){
			case "newest":
				reviewsSorting = ReviewsSorting.NEWEST;
				break;
			case "best":
				reviewsSorting = ReviewsSorting.BEST;
				break;
		}
		model.addAttribute("reviews", reviewsSorting.getSortedReviews(reviewService));

		return "fragments/reviews/reviews-list :: reviews-list";
	}



}
