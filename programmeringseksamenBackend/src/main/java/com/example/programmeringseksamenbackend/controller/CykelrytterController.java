package com.example.programmeringseksamenbackend.controller;

import com.example.programmeringseksamenbackend.entity.Cykelrytter;
import com.example.programmeringseksamenbackend.service.CykelrytterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("rytter")
public class CykelrytterController {

    @Autowired
    CykelrytterService cykelrytterService;

    @GetMapping("/alle-ryttere")
    public List<Cykelrytter> getAlleRyttere() {
        return cykelrytterService.getAlleRyttere();
    }

}
