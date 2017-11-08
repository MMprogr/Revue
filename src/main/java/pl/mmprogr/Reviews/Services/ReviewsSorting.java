package pl.mmprogr.Reviews.Services;

import org.springframework.stereotype.Component;
import pl.mmprogr.Reviews.Models.Review;

import java.util.List;

/**
 * Created by ggere on 08.11.2017.
 */
interface Sorting {

	List<Review> getSortedReviews(ReviewService reviewService);
}

@Component
public enum ReviewsSorting implements Sorting {

	NEWEST {
		@Override
		public List<Review> getSortedReviews(ReviewService reviewService){
			return reviewService.findAllByOrderByDate();
		}
	},
	BEST {
		@Override
		public List<Review> getSortedReviews(ReviewService reviewService){
			return reviewService.findAllByOrderByQuality();
		}
	},
}
