package com.example;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftwareEngineerService {
    private final SoftwareEngineerRepository softwareEngineerRepository;

    public SoftwareEngineerService(SoftwareEngineerRepository softwareEngineerRepository) {
        this.softwareEngineerRepository = softwareEngineerRepository;
    }

    public void addSoftwareEngineer(SoftwareEngineer softwareEngineer) {
        this.softwareEngineerRepository.save(softwareEngineer);
    }

    public List<SoftwareEngineer> getSoftwareEngineer () {
        return softwareEngineerRepository.findAll();
    }

    public SoftwareEngineer getSoftwareEngineerById(Integer id) {
        return softwareEngineerRepository.findById(id).orElseThrow(() -> new IllegalAccessError(id + "not found"));
    }

    public SoftwareEngineer deleteSoftwareEngineerById(Integer id) {
        SoftwareEngineer engineer = softwareEngineerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("SoftwareEngineer not found"));
        softwareEngineerRepository.deleteById(id);
        return engineer;
    }

    public SoftwareEngineer putEngineerById(SoftwareEngineer softwareEngineer, Integer id) {
        SoftwareEngineer existingEngineer = softwareEngineerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("SoftwareEngineer not found"));
        existingEngineer.setName(softwareEngineer.getName());
        existingEngineer.setTechStack(softwareEngineer.getTechStack());
        return softwareEngineerRepository.save(existingEngineer);
    }
}
