package coursework.fourth.course.serice;

import coursework.fourth.course.dto.MixDTO;
import coursework.fourth.course.model.Mixes;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MixesService {

    public List<MixDTO> getAll(List<Mixes> resultset) {

        return resultset.stream().map(n -> MixDTO.builder()
                .id(n.getId())
                .name(n.getName())
                .ingredients(n.getIngredients())
                .description(n.getDescription())
                .mark(n.getMark())
                .build()).collect(Collectors.toCollection(ArrayList::new));
    }

    public MixDTO getOne(Mixes teacher) {
        return MixDTO.builder()
                .id(teacher.getId())
                .name(teacher.getName())
                .ingredients(teacher.getIngredients())
                .description(teacher.getDescription())
                .mark(teacher.getMark())
                .build();
    }
}
