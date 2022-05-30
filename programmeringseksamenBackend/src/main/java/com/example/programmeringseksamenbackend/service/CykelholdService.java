package com.example.programmeringseksamenbackend.service;

import com.example.programmeringseksamenbackend.entity.Cykelhold;
import com.example.programmeringseksamenbackend.entity.Cykelrytter;
import com.example.programmeringseksamenbackend.repository.CykelholdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CykelholdService {

    @Autowired
    CykelholdRepository cykelholdRepository;

    public List<Cykelhold> getAlleHold() {
        return cykelholdRepository.findAll();
    }

    public Cykelhold getCykelholdById(String id) {
        return cykelholdRepository.findById(id).get();
    }

    public void saveCykelhold(Cykelhold cykelhold) {
        cykelholdRepository.save(cykelhold);
    }

    public Cykelhold opretNytHold(Cykelhold cykelhold) {
        return cykelholdRepository.save(cykelhold);
    }

    public Optional<Cykelhold> findById(String id) {
        return cykelholdRepository.findById(id);
    }

    public void sletHold(String id) {
        cykelholdRepository.deleteById(id);
    }
}
