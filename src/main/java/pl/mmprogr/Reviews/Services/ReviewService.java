package pl.mmprogr.Reviews.Services;

import org.springframework.stereotype.Service;
import pl.mmprogr.Reviews.Models.Review;

import java.util.List;

/**
 * Created by ggere on 22.06.2017.
 */
@Service
public interface ReviewService {
     Review findById(Integer id);
     List<Review> findAll();
     void add(Review review);
     void delete(Integer id);
     List<Review> findAllByOrderByDate();
     List<Review> findAllByOrderByQuality();
}