package pl.mmprogr.Subject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.mmprogr.Subject.Models.Subject;
import pl.mmprogr.Subject.Repo.SubjectRepo;

import java.util.List;

/**
 * Created by ggere on 26.07.2017.
 */
@Service
public class SubjectServiceImpl implements SubjectService {
    private final SubjectRepo subjectRepo;

    @Autowired
    public SubjectServiceImpl(SubjectRepo subjectRepo) {
        this.subjectRepo = subjectRepo;
    }

    @Override
    public List<Subject> findAll() {
        return (List<Subject>) subjectRepo.findAll();
    }

    @Override
    public Subject findByTitle(String title) {
        return subjectRepo.findByTitle(title);
    }

    @Override
    public Subject findById(Integer id) {
        return subjectRepo.findOne(id);
    }

}

