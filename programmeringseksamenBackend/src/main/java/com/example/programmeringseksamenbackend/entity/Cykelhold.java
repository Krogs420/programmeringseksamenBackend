package com.example.programmeringseksamenbackend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cykelhold {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int holdId;
    private String holdNavn;
    private String holdRyttere;

    public int getHoldId() {
        return holdId;
    }

    public void setHoldId(int holdId) {
        this.holdId = holdId;
    }

    public String getHoldNavn() {
        return holdNavn;
    }

    public void setHoldNavn(String holdNavn) {
        this.holdNavn = holdNavn;
    }

    public String getHoldRyttere() {
        return holdRyttere;
    }

    public void setHoldRyttere(String holdRyttere) {
        this.holdRyttere = holdRyttere;
    }
}
