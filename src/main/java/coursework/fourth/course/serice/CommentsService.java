package coursework.fourth.course.serice;

import coursework.fourth.course.dto.CommentsDTO;
import coursework.fourth.course.model.Comments;
import coursework.fourth.course.repository.CommentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommentsService {

    @Autowired
    CommentsRepository commentRepository;

    public List<CommentsDTO> getAll(List<Comments> resultset) {

        return resultset.stream().map(n -> CommentsDTO.builder()
                .id(n.getId())
                .name(n.getName())
                .email(n.getEmail())
                .subject(n.getSubject())
                .text(n.getText())
                .build()).collect(Collectors.toCollection(ArrayList::new));
    }

    public void addOne(CommentsDTO commentDTO) {
        Comments comment = Comments.builder()
                .id(commentDTO.getId())
                .name(commentDTO.getName())
                .email(commentDTO.getEmail())
                .subject(commentDTO.getSubject())
                .text(commentDTO.getText())
                .build();
        commentRepository.save(comment);
    }
}
