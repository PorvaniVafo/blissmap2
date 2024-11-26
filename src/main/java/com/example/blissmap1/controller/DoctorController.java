package com.example.blissmap1.controller;

import com.example.blissmap1.dto.DoctorRequest;
import com.example.blissmap1.dto.DoctorResponse;
import com.example.blissmap1.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {

    private final DoctorService doctorService;

    @Autowired
    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @GetMapping
    public List<DoctorResponse> getAllDoctors() {
        return doctorService.getAllDoctors();
    }

    @PostMapping
    public DoctorResponse createDoctor(@RequestBody DoctorRequest request) {
        return doctorService.createDoctor(request);
    }
}
