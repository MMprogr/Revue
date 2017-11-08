package pl.mmprogr.Subject.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.mmprogr.Reviews.Models.Review;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by ggere on 26.07.2017.
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Subject {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "title", nullable = false)
	private String title;

	@Column(name = "content", nullable = false, columnDefinition = "MEDIUMTEXT")
	private String content;

	@Column(name = "date", nullable = false)
	private String date;

	@Column(name = "type", nullable = false)
	private String type;

	@ElementCollection
	@CollectionTable(name = "image_urls", joinColumns = @JoinColumn(name = "subject_id"))
	private Set<String> imageUrls;

	@ElementCollection
	@CollectionTable(name = "tags", joinColumns = @JoinColumn(name = "subject_id"))
	private Set<String> tags;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE, mappedBy = "subject")
	@JsonIgnore
	private Set<Review> reviews = new HashSet<Review>();
}
