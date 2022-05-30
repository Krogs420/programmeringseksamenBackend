package com.example.programmeringseksamenbackend.controller;

import com.example.programmeringseksamenbackend.entity.Cykelhold;
import com.example.programmeringseksamenbackend.entity.Cykelrytter;
import com.example.programmeringseksamenbackend.service.CykelholdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("hold")
public class CykelholdController {

    @Autowired
    CykelholdService cykelholdService;

    //CREATE
    @PostMapping("/tilføjHold")
    @ResponseStatus(HttpStatus.CREATED)
    public Cykelhold postHold(@RequestBody Cykelhold cykelhold) {
        return cykelholdService.opretNytHold(cykelhold);
    }

    //READ - Alle hold
    @GetMapping("/alle-hold")
    public List<Cykelhold> getAlleHold() {
        return cykelholdService.getAlleHold();
    }

    //READ
    @GetMapping("/{id}")
    public Cykelhold getCykelHold(@PathVariable String id) {
        return cykelholdService.getCykelholdById(id);
    }

    //UPDATE
    @PutMapping("/update/{id}")
    public ResponseEntity<Cykelhold> updateHold(@PathVariable String id, @RequestBody Cykelhold cykelhold) {
        Optional<Cykelhold> optionalCykelhold = cykelholdService.findById(id);
        if (optionalCykelhold.isPresent()) {
            cykelholdService.saveCykelhold(cykelhold);
            return new ResponseEntity<>(cykelhold, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(cykelhold, HttpStatus.NOT_FOUND);
        }
    }

    //DELETE
    @DeleteMapping("/slet/{id}")
    public ResponseEntity<String> sletHold(@PathVariable String id) {
        try {
            cykelholdService.sletHold(id);
            return new ResponseEntity<>("Slettet hold med id: " + id, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

}
