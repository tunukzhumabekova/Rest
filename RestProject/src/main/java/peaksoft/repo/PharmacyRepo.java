package peaksoft.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import peaksoft.entity.Medicine;
import peaksoft.entity.Pharmacy;

import java.util.List;

@RepositoryRestResource(path = "pharmacies")
public interface PharmacyRepo extends JpaRepository<Pharmacy, Long> {
    List<Pharmacy> getAllMedicinesByPharmacyId(Long pharmacyId);

    List<Pharmacy> getPharmacyByWorkerId(long workerId);

    List<Pharmacy> getPharmaciesById(Long pharmacyId);
}
