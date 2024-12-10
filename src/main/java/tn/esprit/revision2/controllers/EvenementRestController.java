package tn.esprit.revision2.controllers;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.revision2.entities.Evenement;
import tn.esprit.revision2.services.IEvenementService;


import java.util.List;

@RestController
@RequestMapping("/evenement")
@AllArgsConstructor
@NoArgsConstructor
public class EvenementRestController {

    @Autowired
    IEvenementService iEvenementService;


    @PostMapping("/create")
    public Evenement createEvenement(@RequestBody Evenement evenement) {
        System.out.println(evenement);
        return iEvenementService.addEvenement(evenement);
    }

    @PutMapping("/update")
    public Evenement updateEvenement(@RequestBody Evenement evenement) {
        System.out.println(evenement);
        return iEvenementService.updateEvenement(evenement);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEvenement(@PathVariable int id) {
        iEvenementService.deleteEvenement(id);
        return "Evenement deleted successfully";
    }

    @GetMapping("/get-by-id/{id}")
    public Evenement getById(@PathVariable int id) {
        return iEvenementService.getEvenementById(id);
    }

    @GetMapping("/get-all")
    public List<Evenement> getAllEvenement() {
        return iEvenementService.getAllEvenement();
    }

}
