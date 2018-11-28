package coursework.fourth.course.controller;

import coursework.fourth.course.dto.MixDTO;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mixes")
@Api(value = "mixes", description = "Endpoints for mixes")
public class MixController {

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Bad request"),
            @ApiResponse(code = 500, message = "Server error")
    })
    @ApiOperation(value = "Get ", response = MixDTO.class)
    @GetMapping("")
    public List<MixDTO> getMixes(){
        return null;
    }

    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Mix successfully edited"),
            @ApiResponse(code = 400, message = "Bad request"),
            @ApiResponse(code = 500, message = "Server error")
    })
    @ApiOperation("Edit mix")
    @PutMapping("/{mix_id}")
    public MixDTO editMix(
            @ApiParam(value = "id of mix", required = true) @PathVariable int mix_id, @RequestBody  MixDTO mixDTO){
        return null;
    }

    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Mix successfully created"),
            @ApiResponse(code = 400, message = "Bad request"),
            @ApiResponse(code = 500, message = "Server error")
    })
    @ApiOperation(value = "Create mix")
    @PostMapping("/create")
    public MixDTO addMix(@RequestBody MixDTO mixDTO){
        return null;
    }
}
