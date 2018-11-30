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
public class CommentsDTO {

    @ApiModelProperty(notes = "Id of the comment")
    private int id;

    private String name;
    private String email;
    private String subject;
    private String text;
}
