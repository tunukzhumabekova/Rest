package peaksoft.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import peaksoft.entity.Medicine;

import java.util.List;

@RepositoryRestResource(path = "medicines")
public interface MedicineRepo extends JpaRepository<Medicine, Long> {
    List<Medicine> getAllByOrderByPriceAsc();

    List<Medicine> getAllByOrderByPriceDesc();

}
