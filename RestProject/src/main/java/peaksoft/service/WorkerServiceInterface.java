package peaksoft.service;

import org.springframework.data.jpa.repository.Query;
import peaksoft.entity.Worker;

import java.util.List;

public interface WorkerServiceInterface {
    @Query("SELECT w FROM Worker w ORDER BY w.salary ASC")
    List<Worker> findAllByOrderBySalaryAsc();

    @Query("SELECT w FROM Worker w ORDER BY w.salary DESC")
    List<Worker> findAllByOrderBySalaryDesc();

    @Query("SELECT w FROM Worker w JOIN w.pharmacyList p WHERE p.id = :pharmacyId")
    List<Worker> getAllWorkersByPharmacyId(Long pharmacyId);
}
