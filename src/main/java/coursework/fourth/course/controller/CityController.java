package coursework.fourth.course.controller;

import coursework.fourth.course.dto.CityDTO;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cities")
@Api(value = "cities", description = "Endpoints for cities")
public class CityController {

    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "City successfully created"),
            @ApiResponse(code = 400, message = "Bad request"),
            @ApiResponse(code = 500, message = "Server error")
    })
    @ApiOperation(value = "Create city")
    @PostMapping("/create")
    public CityDTO addCity(@ApiParam(value = "city object", required = true) @RequestBody CityDTO cityDTO){
        return null;
    }

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Bad request"),
            @ApiResponse(code = 500, message = "Server error")
    })
    @ApiOperation(value = "Get all cities")
    @GetMapping
    public List<CityDTO> getCities(){
        return null;
    }
}
