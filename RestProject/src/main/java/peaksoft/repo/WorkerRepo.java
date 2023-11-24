package peaksoft.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import peaksoft.entity.Pharmacy;
import peaksoft.entity.Worker;

import java.util.List;

@RepositoryRestResource(path = "workers")
public interface WorkerRepo extends JpaRepository<Worker, Long> {
    List<Worker> getAllByOrderBySalaryAsc();

    List<Worker> getAllByOrderBySalaryDesc();
    List<Worker> getAllWorkersByPharmacyId(Long pharmacyId);

}
