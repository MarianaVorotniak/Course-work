package coursework.fourth.course.controller;

import coursework.fourth.course.dto.TabaccoDTO;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tabaccos")
@Api(value = "tabaccos", description = "Endpoints for tabaccos")
public class TabaccoController {
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Bad request"),
            @ApiResponse(code = 500, message = "Server error")
    })
    @ApiOperation(value = "Get ", response = TabaccoDTO.class)
    @GetMapping("")
    public List<TabaccoDTO> getTabaccos(){
        return null;
    }

    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Tabacco successfully edited"),
            @ApiResponse(code = 400, message = "Bad request"),
            @ApiResponse(code = 500, message = "Server error")
    })
    @ApiOperation("Edit place")
    @PutMapping("/{tabacco_id}")
    public TabaccoDTO editTabacco(
            @ApiParam(value = "id of tabacco", required = true) @PathVariable int tabacco_id, @RequestBody TabaccoDTO tabaccoDTO){
        return null;
    }

    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Tabacco successfully created"),
            @ApiResponse(code = 400, message = "Bad request"),
            @ApiResponse(code = 500, message = "Server error")
    })
    @ApiOperation(value = "Create tabacco")
    @PostMapping("/create")
    public TabaccoDTO addTabacco(@RequestBody TabaccoDTO tabaccoDTO){
        return null;
    }
}
