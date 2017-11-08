package pl.mmprogr.User.Services;

import org.springframework.stereotype.Service;
import pl.mmprogr.User.Models.User;

import java.util.List;

/**
 * Created by ggere on 27.03.2017.
 */
@Service
public interface UserService {
    List<User> findAll();
    User findByUsername(String u);
    User findById(Integer id);
}
