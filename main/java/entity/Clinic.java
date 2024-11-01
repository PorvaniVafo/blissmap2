package entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Clinic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String city;
    private String phoneNumber;

    @OneToMany(mappedBy = "clinic", cascade = CascadeType.ALL)
    private List<Doctor> doctors;


}

