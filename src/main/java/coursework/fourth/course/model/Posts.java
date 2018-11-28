package coursework.fourth.course.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="posts")
@Inheritance(strategy = InheritanceType.JOINED)
@Data
@EqualsAndHashCode(of="id")
@NoArgsConstructor
@ToString(of = {"id"})
public class Posts {

    @Id
    @GeneratedValue
    private int id;
    @NotNull
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Users user;
    @NotNull
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Marks mark;
    @NotNull
    @Size(max = 40)
    private String name;
    private String description;

    public Posts(Users user, Marks mark, String name, String description)
    {
        super();
        this.user = user;
        this.mark = mark;
        this.name = name;
        this.description = description;
    }
}
