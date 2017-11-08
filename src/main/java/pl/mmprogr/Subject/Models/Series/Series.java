package pl.mmprogr.Subject.Models.Series;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import pl.mmprogr.Subject.Models.Subject;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * Created by ggere on 26.07.2017.
 */
@Entity(name = "series")
@Getter
@Setter
@AllArgsConstructor
@PrimaryKeyJoinColumn(name = "series_is", referencedColumnName = "id")
public class Series extends Subject {
}

