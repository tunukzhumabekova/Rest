package peaksoft.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.entity.Worker;
import peaksoft.repo.WorkerRepo;
import peaksoft.service.WorkerServiceInterface;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WorkerServiceImpl implements WorkerServiceInterface {
    private final WorkerRepo workerRepo;

    @Override
    public List<Worker> findAllByOrderBySalaryAsc() {
        return workerRepo.getAllByOrderBySalaryAsc();
    }

    @Override
    public List<Worker> findAllByOrderBySalaryDesc() {
        return workerRepo.getAllByOrderBySalaryDesc();
    }

    @Override
    public List<Worker> getAllWorkersByPharmacyId(Long pharmacyId) {
        return workerRepo.getAllWorkersByPharmacyId(pharmacyId);
    }
}
