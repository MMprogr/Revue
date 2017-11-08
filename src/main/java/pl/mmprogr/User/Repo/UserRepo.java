package pl.mmprogr.User.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.mmprogr.User.Models.User;

/**
 * Created by ggere on 27.03.2017.
 */
@Repository
public interface UserRepo extends CrudRepository<User, Integer> {
    User findByUsername(String u);
}

