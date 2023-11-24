package peaksoft.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.entity.Pharmacy;
import peaksoft.repo.PharmacyRepo;
import peaksoft.service.PharmacyServiceInterface;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PharmacyServiceImpl implements PharmacyServiceInterface {

 private final PharmacyRepo pharmacyRepo;
    @Override
    public List<Pharmacy> getAllMedicinesByPharmacyId(Long pharmacyId) {
        return pharmacyRepo.getAllMedicinesByPharmacyId(pharmacyId);
    }

    @Override
    public List<Pharmacy> getPharmacyByWorkerId(long workerId) {
        return pharmacyRepo.getPharmacyByWorkerId(workerId);
    }

    @Override
    public List<Pharmacy> getPharmaciesById(Long pharmacyId) {
        return pharmacyRepo.getPharmaciesById(pharmacyId);
    }
}
