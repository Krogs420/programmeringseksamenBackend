package com.example.programmeringseksamenbackend.service;

import com.example.programmeringseksamenbackend.entity.Cykelrytter;
import com.example.programmeringseksamenbackend.repository.CykelrytterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

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

    public Cykelrytter opretNyRytter(Cykelrytter cykelrytter) {
        return cykelrytterRepository.save(cykelrytter);
    }

    public Optional<Cykelrytter> findById(int id) {
        return cykelrytterRepository.findById(id);
    }

    public void sletRytter(int id) {
        cykelrytterRepository.deleteById(id);
    }


}
