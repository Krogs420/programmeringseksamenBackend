package com.example.programmeringseksamenbackend.controller;

import com.example.programmeringseksamenbackend.entity.Cykelhold;
import com.example.programmeringseksamenbackend.entity.Cykelrytter;
import com.example.programmeringseksamenbackend.repository.CykelholdRepository;
import com.example.programmeringseksamenbackend.service.CykelholdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("hold")
public class CykelholdController {

    @Autowired
    CykelholdService cykelholdService;

    @GetMapping("/alle-hold")
    public List<Cykelhold> getAlleHold() {
        return cykelholdService.getAlleHold();
    }

    @GetMapping("/{id}")
    public Cykelhold getCykelHold(@PathVariable int id) {
        return cykelholdService.getCykelholdById(id);
    }
}
