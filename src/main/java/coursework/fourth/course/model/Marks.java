package coursework.fourth.course.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="marks")
@Inheritance(strategy = InheritanceType.JOINED)
@Data
@EqualsAndHashCode(of="id")
@NoArgsConstructor
@ToString(of = {"id"})
public class Marks {

    @Id
    @GeneratedValue
    private int id;
    @Max(5)
    @NotNull
    private int mark;

    public Marks(int mark)
    {
        super();
        this.mark = mark;
    }
}
