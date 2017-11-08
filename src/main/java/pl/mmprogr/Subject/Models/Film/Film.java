package pl.mmprogr.Subject.Models.Film;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.mmprogr.Subject.Models.Subject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * Created by ggere on 26.07.2017.
 */
@Entity(name = "film")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@PrimaryKeyJoinColumn(name = "subject_id", referencedColumnName = "id")
public class Film extends Subject {

    @Column(name = "scenarist")
    private String scenarist;

    @Column(name = "director")
    private String director;
}
