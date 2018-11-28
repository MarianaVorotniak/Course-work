package coursework.fourth.course.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {

    @ApiModelProperty(notes = "User's id")
    private int id;

    @ApiModelProperty(notes = "User's login")
    private String login;

    @ApiModelProperty(notes = "User's password")
    private String password;

    @ApiModelProperty(notes = "User's email")
    private String email;

    @ApiModelProperty(notes = "User's nickname")
    private String nickname;

    @ApiModelProperty(notes = "User's description")
    private String description;

    @ApiModelProperty(notes = "Avatar of the user")
    private String avatar;
}
