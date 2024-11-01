package controller;

import entity.Specialty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.SpecialtyService;

import java.util.List;

@RestController
@RequestMapping("/api/specialties")
public class SpecialtyController {

    private final SpecialtyService specialtyService;

    @Autowired
    public SpecialtyController(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @GetMapping
    public List<Specialty> getAllSpecialties() {
        return specialtyService.getAllSpecialties();
    }

    @GetMapping("/{id}")
    public Specialty getSpecialtyById(@PathVariable Long id) {
        return specialtyService.getSpecialtyById(id);
    }

    @PostMapping
    public Specialty addSpecialty(@RequestBody Specialty specialty) {
        return specialtyService.addSpecialty(specialty);
    }

    @PutMapping("/{id}")
    public Specialty updateSpecialty(@PathVariable Long id, @RequestBody Specialty specialty) {
        return specialtyService.updateSpecialty(id, specialty);
    }

    @DeleteMapping("/{id}")
    public void deleteSpecialty(@PathVariable Long id) {
        specialtyService.deleteSpecialty(id);
    }
}
