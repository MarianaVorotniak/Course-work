package coursework.fourth.course.repository;

import coursework.fourth.course.model.Mixes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MixesRepository extends JpaRepository<Mixes, Integer> {

}
