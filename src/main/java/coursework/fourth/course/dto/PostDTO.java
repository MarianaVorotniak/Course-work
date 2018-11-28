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
public class PostDTO {

    @ApiModelProperty(notes = "Id of the post")
    private int id;

    @ApiModelProperty(notes = "Name of the post")
    private String post_name;

    @ApiModelProperty(notes = "Description of the post")
    private String description;
}
