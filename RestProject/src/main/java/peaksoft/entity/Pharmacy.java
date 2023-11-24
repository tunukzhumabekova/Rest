package peaksoft.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "pharmacies")
public class Pharmacy {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_seq")
    @SequenceGenerator(name = "my_seq", sequenceName = "my_sequence", initialValue = 1)
    private Long id;
    private String name;
    private String address;

    @ManyToMany(cascade = {CascadeType.PERSIST},fetch = FetchType.EAGER)
    private List<Medicine> medicines;
    @ManyToMany(cascade= CascadeType.PERSIST, fetch = FetchType.EAGER)
    private List<Worker>workers;


}
