package peaksoft.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import peaksoft.entity.Medicine;
import peaksoft.service.MedicineServiceInterface;

import java.util.List;

@RestController
@RequestMapping("/medicines")
@RequiredArgsConstructor
public class MedicineController {
    private final MedicineServiceInterface medicineService;

    @GetMapping("/sortedByPriceAsc")
    public List<Medicine> getAllMedicinesSortedByPriceAsc() {
        return medicineService.findAllByOrderByPriceAsc();
    }

    @GetMapping("/sortedByPriceDesc")
    public List<Medicine> getAllMedicinesSortedByPriceDesc() {
        return medicineService.findAllByOrderByPriceDesc();
    }
}
