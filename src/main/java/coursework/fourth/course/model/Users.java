package coursework.fourth.course.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="user")
@Inheritance(strategy = InheritanceType.JOINED)
@Data
@EqualsAndHashCode(of="id")
@NoArgsConstructor
@ToString(of = {"id"})
public class Users {

    @Id
    @GeneratedValue
    private int id;
    @NotBlank
    @Size(max=100, min=5)
    private String login;
    @NotBlank
    @Size(max=40)
    private String password;
    @Email
    private String email;
    @Size(max=40)
    private String nickname;
    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(length = 8)
    private Role role;
    @Size(max=9999999)
    private String avatar;
    @Size(max=200)
    private String description;

    public Users(String login, String password, String email, String nickname, Role role, String avatar, String description) {
        super();
        this.login = login;
        this.password = password;
        this.email = email;
        this.nickname = nickname;
        this.role = role;
        this.avatar = avatar;
        this.description = description;
    }

    public enum Role {
        ROLE_USER, ROLE_ADMIN
    }
}
