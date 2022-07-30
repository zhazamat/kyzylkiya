package globalgarment.kyzylkiya.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Furniture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long f_id;
    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable( joinColumns = @JoinColumn(name = "f_id"), inverseJoinColumns = @JoinColumn(name = "article_id"))
    private Set<Article> articles;
}
