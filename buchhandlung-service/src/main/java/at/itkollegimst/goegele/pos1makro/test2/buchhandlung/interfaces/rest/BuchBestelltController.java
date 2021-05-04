package at.itkollegimst.goegele.pos1makro.test2.buchhandlung.interfaces.rest;

import at.itkollegimst.goegele.pos1makro.test2.buchhandlung.application.internal.commandservices.BuchBestelltCommandService;
import at.itkollegimst.goegele.pos1makro.test2.buchhandlung.domain.model.aggregates.Bestellungid;
import at.itkollegimst.goegele.pos1makro.test2.buchhandlung.domain.model.commands.BuchBestelltCommand;
import at.itkollegimst.goegele.pos1makro.test2.buchhandlung.domain.model.valueobjects.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/buchbestellt")
public class BuchBestelltController {

    @Autowired
    private BuchBestelltCommandService service;

    @PostMapping
    @ResponseBody
    public Bestellungid bestellen(){
        Bestellungid id = service.bestellen(new BuchBestelltCommand());
        return id;
    }


}
