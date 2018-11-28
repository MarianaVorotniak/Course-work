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
public class CommentDTO {

    @ApiModelProperty(notes = "Id of the comment")
    private int id;

    @ApiModelProperty(notes = "The comment")
    private String comment;
}
