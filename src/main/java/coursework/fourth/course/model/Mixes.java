package coursework.fourth.course.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="mixes")
//@Inheritance(strategy = InheritanceType.JOINED)
@Data
@EqualsAndHashCode(of="id")
@NoArgsConstructor
@ToString(of = {"id"})
@AllArgsConstructor
@Builder
public class Mixes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
//    @NotNull
//    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
//    private Posts post;

    private String name;
    private String ingredients;
    private String description;
    private int mark;

    public Mixes(String name, String ingredients, String description, int mark)
    {
        super();
        this.name = name;
        this.ingredients = ingredients;
        this.description = description;
        this.mark = mark;
    }
}
