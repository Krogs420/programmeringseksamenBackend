package com.example.programmeringseksamenbackend.Service;

import com.example.programmeringseksamenbackend.entity.Cykelhold;
import com.example.programmeringseksamenbackend.service.CykelholdService;
import com.example.programmeringseksamenbackend.service.CykelrytterService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CykelrytterServiceTest {

        @Autowired
        CykelholdService cykelholdService;

        @BeforeEach
        void beforeEach(){
            Cykelhold cykelhold = new Cykelhold();
            cykelhold.setHoldId("1");
            cykelhold.setHoldNavn("HoldTest");
            cykelholdService.saveCykelhold(cykelhold);

        }

        @Test
        void testFunction() {
            List<Cykelhold> hold = cykelholdService.getAlleHold();
            Assertions.assertEquals(true, hold.size()>0);
        }
}