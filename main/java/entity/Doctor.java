package entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double rating;
    private String phoneNumber;
    private String email;

    @ManyToOne
    @JoinColumn(name = "specialty_id", nullable = false)
    private Specialty specialty;

    @ManyToOne
    @JoinColumn(name = "clinic_id", nullable = false)
    private Clinic clinic;

    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
    private List<Review> reviews;


    public Doctor() {}

    public Doctor(String name, double rating, String phoneNumber, String email, Specialty specialty, Clinic clinic) {
        this.name = name;
        this.rating = rating;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.specialty = specialty;
        this.clinic = clinic;
    }


}
