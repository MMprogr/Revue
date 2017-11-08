package pl.mmprogr.Reviews.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.mmprogr.Subject.Models.Subject;
import pl.mmprogr.User.Models.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;

/**
 * Created by ggere on 22.06.2017.
 */
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "review")
public class Review {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;

	@Column(name = "title", nullable = false)
	private String title;

	@Column(name = "backgroundImage", nullable = false)
	private String backgroundImage;

	@Column(name = "content", nullable = false, columnDefinition = "MEDIUMTEXT")
	private String content;

	@Column(name = "summary", nullable = false, columnDefinition = "MEDIUMTEXT", length = 300)
	private String summary;

	@Column(name = "date", nullable = false)
	private Date date;

	@Column(name = "quality", nullable = false)
	private int quality;

	@Column(name = "rating", nullable = false)
	private int rating;

	@NotNull
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "subject_id")
	private Subject subject;

    /*

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE, mappedBy = "review")
    @JsonIgnore
    private Set<Comment> comments = new HashSet<>();

    @JsonIgnore
    @ManyToMany(cascade=CascadeType.MERGE)
    @JoinTable(name="review_plus_author", joinColumns=@JoinColumn(name="review_id"), inverseJoinColumns=@JoinColumn(name="plus_author_id"),
            uniqueConstraints = {@UniqueConstraint(
                    columnNames = {"review_id", "plus_author_id"})})
    private Set<User> pluses = new HashSet<>();
    */

}
