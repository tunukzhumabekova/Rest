package peaksoft.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import peaksoft.entity.Pharmacy;
import peaksoft.service.PharmacyServiceInterface;

import java.util.List;

@RestController
@RequestMapping("/pharmacies")
@RequiredArgsConstructor
public class PharmacyController {

    private final PharmacyServiceInterface pharmacyService;

    @GetMapping("/medicines")
    public List<Pharmacy> getAllMedicinesByPharmacyId(@RequestParam Long pharmacyId) {
        return pharmacyService.getAllMedicinesByPharmacyId(pharmacyId);
    }

    @GetMapping("/workers")
    public List<Pharmacy> getPharmacyByWorkerId(@RequestParam long workerId) {
        return pharmacyService.getPharmacyByWorkerId(workerId);
    }

    @GetMapping("/byId")
    public List<Pharmacy> getPharmaciesById(@RequestParam Long pharmacyId) {
        return pharmacyService.getPharmaciesById(pharmacyId);
    }
}
