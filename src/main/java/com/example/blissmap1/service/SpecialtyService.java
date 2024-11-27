package com.example.blissmap1.service;

import com.example.blissmap1.entity.Specialty;
import com.example.blissmap1.repository.SpecialtyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecialtyService {

    private final SpecialtyRepository specialtyRepository;

    @Autowired
    public SpecialtyService(SpecialtyRepository specialtyRepository) {
        this.specialtyRepository = specialtyRepository;
    }

    public List<Specialty> getAllSpecialties() {
        return specialtyRepository.findAll();
    }

    public Specialty getSpecialtyById(Long id) {
        return specialtyRepository.findById(id).orElse(null);
    }

    public Specialty createSpecialty(Specialty specialty) {
        return specialtyRepository.save(specialty);
    }

    public Specialty updateSpecialty(Long id, Specialty updatedSpecialty) {
        return specialtyRepository.findById(id).map(specialty -> {
            specialty.setName(updatedSpecialty.getName());
            return specialtyRepository.save(specialty);
        }).orElse(null);
    }

    public void deleteSpecialty(Long id) {
        specialtyRepository.deleteById(id);
    }
}
