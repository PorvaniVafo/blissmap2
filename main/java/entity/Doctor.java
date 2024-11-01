package entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "name")
    String name;

    @Column(name = "rating")
    Double rating;

    @Column(name = "phoneNumber")
    String phoneNumber;

    @Column(name = "email")
    String email;

//    @ManyToOne
//    @JoinColumn(name = "specialty_id", nullable = false)
//    Specialty specialty;
//
//    @ManyToOne
//    @JoinColumn(name = "clinic_id", nullable = false)
//    Clinic clinic;
//
//    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
//    List<Review> reviews;
}