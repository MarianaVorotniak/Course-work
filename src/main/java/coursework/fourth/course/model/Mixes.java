package coursework.fourth.course.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="mixes")
@Inheritance(strategy = InheritanceType.JOINED)
@Data
@EqualsAndHashCode(of="id")
@NoArgsConstructor
@ToString(of = {"id"})
public class Mixes {

    @Id
    @GeneratedValue
    private int id;
    @NotNull
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Posts post;

    public Mixes(Posts posts)
    {
        super();
        this.post = posts;
    }
}
