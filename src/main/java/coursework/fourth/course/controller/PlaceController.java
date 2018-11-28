package coursework.fourth.course.controller;

import coursework.fourth.course.dto.PlaceDTO;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/places")
@Api(value = "places", description = "Endpoints for places")
public class PlaceController {

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Bad request"),
            @ApiResponse(code = 500, message = "Server error")
    })
    @ApiOperation(value = "Get ", response = PlaceDTO.class)
    @GetMapping("")
    public List<PlaceDTO> getPlaces(){
        return null;
    }

    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Place successfully edited"),
            @ApiResponse(code = 400, message = "Bad request"),
            @ApiResponse(code = 500, message = "Server error")
    })
    @ApiOperation("Edit place")
    @PutMapping("/{place_id}")
    public PlaceDTO editPlace(
            @ApiParam(value = "id of place", required = true) @PathVariable int place_id, @RequestBody PlaceDTO placeDTO){
        return null;
    }

    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Place successfully created"),
            @ApiResponse(code = 400, message = "Bad request"),
            @ApiResponse(code = 500, message = "Server error")
    })
    @ApiOperation(value = "Create place")
    @PostMapping("/create")
    public PlaceDTO addPlace(@RequestBody PlaceDTO placeDTO){
        return null;
    }
}
