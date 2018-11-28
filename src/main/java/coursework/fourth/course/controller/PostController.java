package coursework.fourth.course.controller;

import coursework.fourth.course.dto.PostDTO;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
@Api(value = "posts", description = "Endpoints for posts")
public class PostController {
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Bad request"),
            @ApiResponse(code = 500, message = "Server error")
    })
    @ApiOperation(value = "Get ", response = PostDTO.class)
    @GetMapping("")
    public List<PostDTO> getPosts(){
        return null;
    }

    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Post successfully edited"),
            @ApiResponse(code = 400, message = "Bad request"),
            @ApiResponse(code = 500, message = "Server error")
    })
    @ApiOperation("Edit place")
    @PutMapping("/{post_id}")
    public PostDTO editPost(
            @ApiParam(value = "id of post", required = true) @PathVariable int post_id, @RequestBody PostDTO postDTO){
        return null;
    }

    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Post successfully created"),
            @ApiResponse(code = 400, message = "Bad request"),
            @ApiResponse(code = 500, message = "Server error")
    })
    @ApiOperation(value = "Create post")
    @PostMapping("/create")
    public PostDTO addPost(@RequestBody PostDTO postDTO){
        return null;
    }
}
