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
public class CityDTO {

    @ApiModelProperty(notes = "Id of the city")
    private int id;

    @ApiModelProperty(notes = "Name of the city")
    private String city_name;
}
