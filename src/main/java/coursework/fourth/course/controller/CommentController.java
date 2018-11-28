package coursework.fourth.course.controller;

import coursework.fourth.course.dto.CommentDTO;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
@Api(value = "comments", description = "Endpoints for comments")
public class CommentController {

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Bad request"),
            @ApiResponse(code = 500, message = "Server error")
    })
    @ApiOperation(value = "Get ", response = CommentDTO.class)
    @GetMapping("/posts/{post_id}/comments")
    public List<CommentDTO> getComments(@ApiParam(value = "id of post", required = true) @PathVariable int post_id){
        return null;
    }

    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Comment successfully edited"),
            @ApiResponse(code = 400, message = "Bad request"),
            @ApiResponse(code = 500, message = "Server error")
    })
    @ApiOperation("Edit comment")
    @PutMapping("/posts/{post_id}/comments/{comment_id}")
    public CommentDTO editComment(
            @ApiParam(value = "id of post", required = true) @PathVariable int post_id,
            @ApiParam(value = "id of comment", required = true) @PathVariable int comment_id,
            @RequestBody CommentDTO commentDTO){
        return null;
    }

    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Comment successfully created"),
            @ApiResponse(code = 400, message = "Bad request"),
            @ApiResponse(code = 500, message = "Server error")
    })
    @ApiOperation(value = "Create comment")
    @PostMapping("/posts/{post_id}/comments/create")
    public CommentDTO addComment(
            @ApiParam(value = "id of post", required = true) @PathVariable int post_id,
            @RequestBody CommentDTO commentDTO){
        return null;
    }
}
