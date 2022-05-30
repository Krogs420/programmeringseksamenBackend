package com.example.programmeringseksamenbackend.service;

import com.example.programmeringseksamenbackend.entity.Cykelhold;
import com.example.programmeringseksamenbackend.entity.Cykelrytter;
import com.example.programmeringseksamenbackend.repository.CykelholdRepository;
import com.example.programmeringseksamenbackend.repository.CykelrytterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CykelrytterService {

    @Autowired
    CykelrytterRepository cykelrytterRepository;

    public List<Cykelrytter> getAlleRyttere() {
        return cykelrytterRepository.findAll();
    }

    public Cykelrytter getCykelrytterById(int id) {
        return cykelrytterRepository.findById(id).get();
    }

    public void saveCykelrytter(Cykelrytter cykelrytter) {
        cykelrytterRepository.save(cykelrytter);
    }
}
