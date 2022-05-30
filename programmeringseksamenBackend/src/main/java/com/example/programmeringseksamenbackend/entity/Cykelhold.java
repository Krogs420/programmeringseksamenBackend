package com.example.programmeringseksamenbackend.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cykelhold {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String holdId;
    private String holdNavn;

    @OneToMany
    @JoinColumn(name="rytterId")
    @JsonBackReference
    private List<Cykelrytter> cykelrytter;

    public String getHoldId() {
        return holdId;
    }

    public void setHoldId(String holdId) {
        this.holdId = holdId;
    }

    public String getHoldNavn() {
        return holdNavn;
    }

    public void setHoldNavn(String holdNavn) {
        this.holdNavn = holdNavn;
    }

    public List<Cykelrytter> getCykelrytter() {
        return cykelrytter;
    }

    public void setCykelrytter(List<Cykelrytter> cykelrytter) {
        this.cykelrytter = cykelrytter;
    }
}
