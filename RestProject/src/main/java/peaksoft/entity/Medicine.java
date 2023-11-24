package peaksoft.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "medicines")
public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_seq")
    @SequenceGenerator(name = "my_seq", sequenceName = "my_sequence", initialValue = 1)
    private Long id;
    private String name;
    private int price;
    @ManyToMany(mappedBy = "medicines")
    private List<Pharmacy> pharmacyList;



}
