package pl.mmprogr.Reviews.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.mmprogr.Reviews.Models.Review;

import java.util.List;

/**
 * Created by ggere on 22.06.2017.
 */
@Repository
public interface ReviewRepo extends JpaRepository<Review, Integer> {
	List<Review> findAllByOrderByDate();
	List<Review> findAllByOrderByQuality();

}

