package pl.mmprogr.Subject.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.mmprogr.Subject.Models.Subject;

/**
 * Created by ggere on 26.07.2017.
 */
@Repository
public interface SubjectRepo extends CrudRepository<Subject, Integer> {
    Subject findByTitle(String t);
}
