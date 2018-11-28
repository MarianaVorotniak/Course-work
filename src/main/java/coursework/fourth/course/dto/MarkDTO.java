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
public class MarkDTO {

    @ApiModelProperty(notes = "Id of the mark")
    private int id;

    @ApiModelProperty(notes = "The mark (can be from 1 to 5)")
    private int mark;
}
