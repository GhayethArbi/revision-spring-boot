package tn.esprit.revision2.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.revision2.entities.Logistique;

import tn.esprit.revision2.services.ILogistiqueService;

import java.util.List;

@RestController
@RequestMapping("/logistique")
@AllArgsConstructor

public class LogistiqueRestController {

    @Autowired
    ILogistiqueService iLogistiqueService;


    @PostMapping("/create")
    public Logistique createLogistique(@RequestBody Logistique logistique) {
        System.out.println(logistique);
        return iLogistiqueService.addLogistique(logistique);
    }

    @PutMapping("/update")
    public Logistique updateLogistique(@RequestBody Logistique logistique) {
        System.out.println(logistique);
        return iLogistiqueService.updateLogistique(logistique);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteLogistique(@PathVariable int id) {
        iLogistiqueService.deleteLogistique(id);
        return "Logistique deleted successfully";
    }

    @GetMapping("/get-by-id/{id}")
    public Logistique getById(@PathVariable int id) {
        return iLogistiqueService.getLogistiqueById(id);
    }

    @GetMapping("/get-all")
    public List<Logistique> getAllLogistique() {
        return iLogistiqueService.getAllLogistique();
    }

}