package com.example.blissmap1.service;

import com.example.blissmap1.entity.Clinic;
import com.example.blissmap1.repository.ClinicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClinicService {

    private final ClinicRepository clinicRepository;

    @Autowired
    public ClinicService(ClinicRepository clinicRepository) {
        this.clinicRepository = clinicRepository;
    }

    public List<Clinic> getAllClinics() {
        return clinicRepository.findAll();
    }

    public Clinic getClinicById(Long id) {
        return clinicRepository.findById(id).orElse(null);
    }

    public Clinic createClinic(Clinic clinic) {
        return clinicRepository.save(clinic);
    }

    public Clinic updateClinic(Long id, Clinic updatedClinic) {
        return clinicRepository.findById(id).map(clinic -> {
            clinic.setName(updatedClinic.getName());
            clinic.setLocation(updatedClinic.getLocation());
            return clinicRepository.save(clinic);
        }).orElse(null);
    }

    public void deleteClinic(Long id) {
        clinicRepository.deleteById(id);
    }
}
