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
public class PlaceDTO {

    @ApiModelProperty(notes = "Id of the place")
    private int id;

    @ApiModelProperty(notes = "Address of the place")
    private String address;

    @ApiModelProperty(notes = "The photo of the place")
    private String picture;
}
