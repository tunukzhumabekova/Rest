package peaksoft.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import peaksoft.entity.Worker;
import peaksoft.service.WorkerServiceInterface;

import java.util.List;

@RestController
@RequestMapping("/workers")
@RequiredArgsConstructor
public class WorkerController {
    private final WorkerServiceInterface workerService;

    @GetMapping("/sortedBySalaryAsc")
    public List<Worker> findAllByOrderBySalaryAsc() {
        return workerService.findAllByOrderBySalaryAsc();
    }

    @GetMapping("/sortedBySalaryDesc")
    public List<Worker> findAllByOrderBySalaryDesc() {
        return workerService.findAllByOrderBySalaryDesc();
    }

    @GetMapping("/getWorker")
    List<Worker> getAllWorkersByPharmacyId(@RequestParam Long pharmacyId) {
        return workerService.getAllWorkersByPharmacyId(pharmacyId);
    }


}
