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
public class MixDTO {

    @ApiModelProperty(notes = "Id of the mix")
    private int id;

    private String name;

    private String ingredients;

    private String description;

    private int mark;
}
