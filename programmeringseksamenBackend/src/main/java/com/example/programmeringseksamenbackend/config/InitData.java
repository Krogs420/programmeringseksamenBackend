package com.example.programmeringseksamenbackend.config;

import com.example.programmeringseksamenbackend.entity.Cykelhold;
import com.example.programmeringseksamenbackend.entity.Cykelrytter;
import com.example.programmeringseksamenbackend.service.CykelholdService;
import com.example.programmeringseksamenbackend.service.CykelrytterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    CykelholdService cykelholdService;

    @Autowired
    CykelrytterService cykelrytterService;


    @Override
    public void run(String... args) throws Exception {

        //Cykelhold
        Cykelhold cykelhold = new Cykelhold();
        cykelhold.setHoldNavn("Trek - Segafredo");
        cykelhold.setHoldRyttere("Bjarne" + "Flemming");

        cykelholdService.saveCykelhold(cykelhold);


        //Cykelryttere
        Cykelrytter cykelrytter = new Cykelrytter();
        cykelrytter.setRytterFornavn("Bjarne");
        cykelrytter.setRytterEfternavn("RIIS");
        cykelrytter.setRytterHold("HellsAngles");
        cykelrytter.setRytterPoints("420");
        cykelrytter.setRytterTid("69");
        cykelrytter.setRytterTrøje("Grøn");

        Cykelrytter cykelrytter1 = new Cykelrytter();
        cykelrytter.setRytterFornavn("Flemming");
        cykelrytter.setRytterEfternavn("JENSEN");
        cykelrytter.setRytterHold("Trek");
        cykelrytter.setRytterPoints("750");
        cykelrytter.setRytterTid("23");
        cykelrytter.setRytterTrøje("Hvid");

        cykelrytterService.saveCykelrytter(cykelrytter);
        cykelrytterService.saveCykelrytter(cykelrytter1);
    }
}
