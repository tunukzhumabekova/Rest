package peaksoft.service;

import org.springframework.data.jpa.repository.Query;
import peaksoft.entity.Medicine;
import peaksoft.entity.Pharmacy;

import java.util.List;

public interface PharmacyServiceInterface {
    @Query("select m from Pharmacy p join p.medicines m where m.id=:pharmacyId")
    List<Pharmacy> getAllMedicinesByPharmacyId(Long pharmacyId);
    @Query("SELECT p FROM Pharmacy p JOIN p.workers w WHERE w.id = :workerId")
    List<Pharmacy> getPharmacyByWorkerId(long workerId);
    @Query("select p from Pharmacy p where p.id=:pharmacyId")
    List<Pharmacy> getPharmaciesById(Long pharmacyId);

}
