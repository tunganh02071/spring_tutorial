package com.example;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/vi/software")
public class SoftwareEngineerController {
    private final SoftwareEngineerService softwareEngineerService;

    public SoftwareEngineerController(SoftwareEngineerService softwareEngineerService) {
        this.softwareEngineerService = softwareEngineerService;
    }

    @GetMapping
    public List<SoftwareEngineer> getEngineer () {
        return softwareEngineerService.getSoftwareEngineer();
    }

    @GetMapping("{id}")
    public SoftwareEngineer getEngineerById (@PathVariable Integer id) {
        return softwareEngineerService.getSoftwareEngineerById(id);
    }

    @PostMapping
    public void createSoftwareEngineer(@RequestBody SoftwareEngineer softwareEngineer) {
        softwareEngineerService.addSoftwareEngineer(softwareEngineer);
    }

    @DeleteMapping("{id}")
    public SoftwareEngineer deleteEngineerById (@PathVariable Integer id) {
        return softwareEngineerService.deleteSoftwareEngineerById(id);
    }

    @PutMapping("{id}")
    public SoftwareEngineer putEngineerById (@RequestBody SoftwareEngineer softwareEngineer, @PathVariable Integer id) {
        return softwareEngineerService.putEngineerById(softwareEngineer, id);
    }

}
