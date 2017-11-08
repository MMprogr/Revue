package pl.mmprogr.Subject.Models.Book;

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
@Entity(name = "book")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@PrimaryKeyJoinColumn(name = "book_id", referencedColumnName = "id")
public class Book extends Subject {

    @Column(name = "pages")
    private int pages;

    @Column(name = "author")
    private int author;
}
