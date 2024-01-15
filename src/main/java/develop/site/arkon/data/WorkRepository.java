package develop.site.arkon.data;

import develop.site.arkon.model.Work;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkRepository extends CrudRepository<Work, Long> {
    List<Work> findAll(Pageable pageable);
}
