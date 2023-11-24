package peaksoft.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.entity.Medicine;
import peaksoft.repo.MedicineRepo;
import peaksoft.service.MedicineServiceInterface;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MedicineServiceImpl implements MedicineServiceInterface {

    private final MedicineRepo medicineRepo;

    @Override
    public List<Medicine> findAllByOrderByPriceAsc() {
       return medicineRepo.getAllByOrderByPriceAsc();
    }

    @Override
    public List<Medicine> findAllByOrderByPriceDesc() {
        return medicineRepo.getAllByOrderByPriceDesc();
    }
}
