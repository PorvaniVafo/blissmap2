package com.example.blissmap1.service;

import com.example.blissmap1.dto.DoctorRequest;
import com.example.blissmap1.dto.DoctorResponse;
import com.example.blissmap1.entity.Doctor;
import com.example.blissmap1.mapper.DoctorMapper;
import com.example.blissmap1.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DoctorService {

    private final DoctorRepository doctorRepository;
    private final DoctorMapper doctorMapper;

    @Autowired
    public DoctorService(DoctorRepository doctorRepository, DoctorMapper doctorMapper) {
        this.doctorRepository = doctorRepository;
        this.doctorMapper = doctorMapper;
    }

    public List<DoctorResponse> getAllDoctors() {
        return doctorRepository.findAll().stream()
                .map(doctorMapper::toResponse)
                .collect(Collectors.toList());
    }

    public DoctorResponse createDoctor(DoctorRequest request) {
        Doctor doctor = doctorMapper.toEntity(request);
        doctor = doctorRepository.save(doctor);
        return doctorMapper.toResponse(doctor);
    }
}
