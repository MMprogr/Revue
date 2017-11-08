package pl.mmprogr.Reviews.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.mmprogr.Reviews.Models.Review;
import pl.mmprogr.Reviews.Repo.ReviewRepo;

import java.util.List;

/**
 * Created by ggere on 22.06.2017.
 */
@Service
public class ReviewServiceImpl implements ReviewService {
    private final ReviewRepo reviewRepo;

    @Autowired
    public ReviewServiceImpl(ReviewRepo reviewRepo) {
        this.reviewRepo = reviewRepo;
    }

    @Override
    public Review findById(Integer id) {
        return reviewRepo.findOne(id);
    }

    @Override
    public List<Review> findAll() {
        return (List<Review>) reviewRepo.findAll();
    }

    @Override
    public void add(Review review) {
        reviewRepo.save(review);
    }

    @Override
    public void delete(Integer id) {
        reviewRepo.delete(id);
    }

    @Override
    public List<Review> findAllByOrderByDate() {
        return reviewRepo.findAllByOrderByDate();
    }

    @Override
    public List<Review> findAllByOrderByQuality() {
        return reviewRepo.findAllByOrderByQuality();
    }
}