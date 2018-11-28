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
public class TabaccoDTO {

    @ApiModelProperty(notes = "Id of the tabacco")
    private int id;

    @ApiModelProperty(notes = "Picture of the tabacco")
    private String picture;
}
