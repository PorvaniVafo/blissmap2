package entity;

import jakarta.persistence.*;
import lombok.*;




@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double rating;
    private String phoneNumber;
    private String email;

//    @ManyToOne
//    @JoinColumn(name = "specialty_id", nullable = false)
//    private Specialty specialty;
//
//    @ManyToOne
//    @JoinColumn(name = "clinic_id", nullable = false)
//    private Clinic clinic;
//
//    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
//    private List<Review> reviews;


}
