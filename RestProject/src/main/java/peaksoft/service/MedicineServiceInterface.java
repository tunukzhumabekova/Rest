package peaksoft.service;

import org.springframework.data.jpa.repository.Query;
import peaksoft.entity.Medicine;

import java.util.List;

public interface MedicineServiceInterface {
    @Query("SELECT m FROM Medicine m ORDER BY m.price ASC")
    List<Medicine> findAllByOrderByPriceAsc();

    @Query("SELECT m FROM Medicine m ORDER BY m.price DESC")
    List<Medicine> findAllByOrderByPriceDesc();
}
