package coursework.fourth.course.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="comments")
//@Inheritance(strategy = InheritanceType.JOINED)
@Data
@EqualsAndHashCode(of="id")
@NoArgsConstructor
@ToString(of = {"id"})
@AllArgsConstructor
@Builder
public class Comments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
//    @NotNull
//    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
//    private Posts post;
//    @NotBlank
//    private String text;

    private String name;
    private String email;
    private String subject;
    private String text;

    public Comments(String name, String email, String subject, String text) {
        super();
        this.name = name;
        this.email = email;
        this.subject = subject;
        this.text = text;
    }
}
