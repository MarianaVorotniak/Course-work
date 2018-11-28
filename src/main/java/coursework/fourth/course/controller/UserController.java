package coursework.fourth.course.controller;

import coursework.fourth.course.dto.UserDTO;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@Api(value = "users", description = "Endpoints for users")
public class UserController {
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Bad request"),
            @ApiResponse(code = 500, message = "Server error")
    })
    @ApiOperation(value = "Get ", response = UserDTO.class)
    @GetMapping("")
    public List<UserDTO> getusers(){
        return null;
    }

    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "user successfully edited"),
            @ApiResponse(code = 400, message = "Bad request"),
            @ApiResponse(code = 500, message = "Server error")
    })
    @ApiOperation("Edit user")
    @PutMapping("/{user_id}")
    public UserDTO edituser(
            @ApiParam(value = "id of user", required = true) @PathVariable int user_id, @RequestBody UserDTO userDTO){
        return null;
    }

    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "user successfully created"),
            @ApiResponse(code = 400, message = "Bad request"),
            @ApiResponse(code = 500, message = "Server error")
    })
    @ApiOperation(value = "Create user")
    @PostMapping("/create")
    public UserDTO adduser(@RequestBody UserDTO userDTO){
        return null;
    }
}
