package coursework.fourth.course.controller;

import coursework.fourth.course.dto.CommentsDTO;
import coursework.fourth.course.repository.CommentsRepository;
import coursework.fourth.course.serice.CommentsService;
import io.swagger.annotations.*;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
@Api(value = "comments", description = "Endpoints for comments")
@RequiredArgsConstructor
public class CommentsController {

    @NonNull
    private CommentsService commentsService;
    @NonNull
    private CommentsRepository commentsRepository;

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Bad request"),
            @ApiResponse(code = 500, message = "Server error")
    })
    @ApiOperation(value = "Get ", response = CommentsDTO.class)
    @GetMapping("")
    public List<CommentsDTO> getComments(){
        return commentsService.getAll(commentsRepository.findAll());
    }

    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Comment successfully edited"),
            @ApiResponse(code = 400, message = "Bad request"),
            @ApiResponse(code = 500, message = "Server error")
    })
    @ApiOperation("Edit comment")
    @PutMapping("/edit")
    public CommentsDTO editComment(
            @ApiParam(value = "id of post", required = true) @PathVariable int post_id,
            @ApiParam(value = "id of comment", required = true) @PathVariable int comment_id,
            @RequestBody CommentsDTO commentDTO){
        return null;
    }

    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Comment successfully created"),
            @ApiResponse(code = 400, message = "Bad request"),
            @ApiResponse(code = 500, message = "Server error")
    })
    @ApiOperation(value = "Create comment")
    @PostMapping("/create")
    public void addComment(@RequestBody CommentsDTO commentDTO){

        commentsService.addOne(commentDTO);
    }
}
