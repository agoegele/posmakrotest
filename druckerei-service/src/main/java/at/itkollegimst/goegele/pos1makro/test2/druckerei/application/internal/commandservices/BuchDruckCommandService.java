package at.itkollegimst.goegele.pos1makro.test2.druckerei.application.internal.commandservices;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class BuchDruckCommandService {

    @Transactional
    public void druckeBuch(String bestellID){

        System.out.println("Bestellung ID: "+bestellID+ "; Wird gedruckt");

    }
}
