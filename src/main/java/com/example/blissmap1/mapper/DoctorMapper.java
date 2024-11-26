package com.example.blissmap1.mapper;

import com.example.blissmap1.dto.DoctorRequest;
import com.example.blissmap1.dto.DoctorResponse;
import com.example.blissmap1.entity.Doctor;
import org.springframework.stereotype.Component;

@Component
public class DoctorMapper {

    public Doctor toEntity(DoctorRequest request) {
        Doctor doctor = new Doctor();
        doctor.setName(request.getName());
        doctor.setEmail(request.getEmail());
        doctor.setPhoneNumber(request.getPhoneNumber());
        return doctor;
    }

    public DoctorResponse toResponse(Doctor doctor) {
        DoctorResponse response = new DoctorResponse();
        response.setId(doctor.getId());
        response.setName(doctor.getName());
        response.setEmail(doctor.getEmail());
        response.setSpecialtyName(doctor.getSpecialty().getName());
        response.setClinicName(doctor.getClinic().getName());
        return response;
    }
}

