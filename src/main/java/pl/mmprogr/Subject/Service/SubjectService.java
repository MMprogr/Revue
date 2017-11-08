package pl.mmprogr.Subject.Service;

import org.springframework.stereotype.Service;
import pl.mmprogr.Subject.Models.Subject;

import java.util.List;

/**
 * Created by ggere on 26.07.2017.
 */
@Service
public interface SubjectService {
    List<Subject> findAll();
    Subject findByTitle(String t);
    Subject findById(Integer id);
}
