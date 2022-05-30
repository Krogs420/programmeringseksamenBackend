package com.example.programmeringseksamenbackend.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class Cykelrytter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rytterId;
    private String rytterFornavn;
    private String rytterEfternavn;
    private String rytterHold;
    private String rytterPoints;
    private String rytterTid;
    private String rytterTrøje;


    @ManyToOne
    @JoinColumn(name="holdId")
    @JsonBackReference
    private Cykelhold cykelhold;


    public int getRytterId() {
        return rytterId;
    }

    public void setRytterId(int rytterId) {
        this.rytterId = rytterId;
    }

    public String getRytterFornavn() {
        return rytterFornavn;
    }

    public void setRytterFornavn(String rytterFornavn) {
        this.rytterFornavn = rytterFornavn;
    }

    public String getRytterEfternavn() {
        return rytterEfternavn;
    }

    public void setRytterEfternavn(String rytterEfternavn) {
        this.rytterEfternavn = rytterEfternavn;
    }

    public String getRytterHold() {
        return rytterHold;
    }

    public void setRytterHold(String rytterHold) {
        this.rytterHold = rytterHold;
    }

    public String getRytterPoints() {
        return rytterPoints;
    }

    public void setRytterPoints(String rytterPoints) {
        this.rytterPoints = rytterPoints;
    }

    public String getRytterTid() {
        return rytterTid;
    }

    public void setRytterTid(String rytterTid) {
        this.rytterTid = rytterTid;
    }

    public String getRytterTrøje() {
        return rytterTrøje;
    }

    public void setRytterTrøje(String rytterTrøje) {
        this.rytterTrøje = rytterTrøje;
    }

    public Cykelhold getCykelhold() {
        return cykelhold;
    }

    public void setCykelhold(Cykelhold cykelhold) {
        this.cykelhold = cykelhold;
    }
}
