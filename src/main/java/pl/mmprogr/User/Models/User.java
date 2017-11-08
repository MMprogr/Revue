package pl.mmprogr.User.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


/**
 * Created by ggere on 25.03.2017.
 */
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "state", nullable = false)
    private String state = "active";

    @Column(name = "role", nullable = false)
    private String role = "user";

    @Column(name = "image_url", nullable = false)
    private String imageUrl;

    @Column(name = "score", nullable = false)
    private int score;

    /*
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE, mappedBy = "user")
    @JsonIgnore
    private Set<Review> reviews = new HashSet<Review>();

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE, mappedBy = "user")
    @JsonIgnore
    private Set<Comment> comments = new HashSet<Comment>();

    @JsonIgnore
    @ManyToMany(cascade=CascadeType.MERGE)
    @JoinTable(name="user_favorites_users", joinColumns=@JoinColumn(name="user_id"), inverseJoinColumns=@JoinColumn(name="favorite_user_id"),
            uniqueConstraints = {@UniqueConstraint(
                    columnNames = {"user_id", "favorite_user_id"})})
    private Set<User> favoriteUsers = new HashSet<>();
    */
}
