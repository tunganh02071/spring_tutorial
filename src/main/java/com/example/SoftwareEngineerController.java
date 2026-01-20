package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/vi/software")
public class SoftwareEngineerController {
    @GetMapping
    public List<SoftwareEngineer> getEngineer () {
        return List.of(
                new SoftwareEngineer(
                        1, "Anhnq", "js, node, java"
                ),
                new SoftwareEngineer(
                        2, "Anhnq2", "js, node, java"
                )
        );
    }

}
