package com.example.programmeringseksamenbackend.controller;

import com.example.programmeringseksamenbackend.entity.Cykelhold;
import com.example.programmeringseksamenbackend.entity.Cykelrytter;
import com.example.programmeringseksamenbackend.service.CykelholdService;
import com.example.programmeringseksamenbackend.service.CykelrytterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("rytter")
public class CykelrytterController {

    @Autowired
    CykelrytterService cykelrytterService;
    @Autowired
    CykelholdService cykelholdService;

    //CREATE
    @PostMapping("/tilføjRytter")
    @ResponseStatus(HttpStatus.CREATED)
    public Cykelrytter postRytter(@RequestBody Cykelrytter cykelrytter) {
        return cykelrytterService.opretNyRytter(cykelrytter);
    }

    //READ - Alle ryttere
    @GetMapping("/alle-ryttere")
    public List<Cykelrytter> getAlleRyttere() {
        return cykelrytterService.getAlleRyttere();
    }

    //READ
    @GetMapping("/{id}")
    public Cykelrytter findById(@PathVariable int id) {
        return cykelrytterService.getCykelrytterById(id);
    }

    //UPDATE
    @PutMapping("/update/{id}")
    public ResponseEntity<Cykelrytter> updateRytter(@PathVariable int id, @RequestBody Cykelrytter cykelrytter) {
        Optional<Cykelrytter> optionalCykelrytter = cykelrytterService.findById(id);
        if (optionalCykelrytter.isPresent()) {
            cykelrytterService.saveCykelrytter(cykelrytter);
            return new ResponseEntity<>(cykelrytter, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(cykelrytter, HttpStatus.NOT_FOUND);
        }
    }

    //DELETE
    @DeleteMapping("/slet/{id}")
    public ResponseEntity<String> sletRytter(@PathVariable int id) {
        try {
            cykelrytterService.sletRytter(id);
            return new ResponseEntity<>("Slettet rytter med id: " + id, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    //FIND HOLD VIA RYTTERE
    @GetMapping("/ryttereViaHold/{id}")
    public Optional<Cykelhold> findRytterViaHoldId(@PathVariable String id) {
        return cykelholdService.findById(id);
    }

}
