package pl.mmprogr.Subject.Models.Game;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import pl.mmprogr.Subject.Models.Subject;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * Created by ggere on 26.07.2017.
 */
@Entity(name = "game")
@Getter
@Setter
@AllArgsConstructor
@PrimaryKeyJoinColumn(name = "game_id", referencedColumnName = "id")
public class Game extends Subject {
}

