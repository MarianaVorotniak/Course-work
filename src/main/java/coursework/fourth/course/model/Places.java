package coursework.fourth.course.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="places")
@Inheritance(strategy = InheritanceType.JOINED)
@Data
@EqualsAndHashCode(of="id")
@NoArgsConstructor
@ToString(of = {"id"})
public class Places {

    @Id
    @GeneratedValue
    private int id;
    @NotNull
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Posts post;
    @NotNull
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Cities city;
    @NotNull
    private String address;
    @Size(max=9999999)
    private String picture;

    public Places(Posts post, Cities city, String address, String picture)
    {
        super();
        this.post = post;
        this.city = city;
        this.address = address;
        this.picture = picture;
    }
}
