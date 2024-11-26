package com.example.blissmap1.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DoctorResponse {
    private Long id;
    private String name;
    private String email;
    private String specialtyName;
    private String clinicName;
}
