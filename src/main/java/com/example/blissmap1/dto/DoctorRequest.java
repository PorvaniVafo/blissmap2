package com.example.blissmap1.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DoctorRequest {
    private String name;
    private String email;
    private String phoneNumber;
    private Long specialtyId;
    private Long clinicId;
}
