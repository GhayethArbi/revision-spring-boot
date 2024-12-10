package tn.esprit.revision2.controllers;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.revision2.entities.Participant;
import tn.esprit.revision2.entities.Participant;
import tn.esprit.revision2.services.IParticipantService;
import tn.esprit.revision2.services.IParticipantService;

import java.util.List;

@RestController
@RequestMapping("/participant")
@AllArgsConstructor
@NoArgsConstructor

public class ParticipantRestController {
    @Autowired
    IParticipantService iParticipantService;


    @PostMapping("/create")
    public Participant createParticipant(@RequestBody Participant participant) {
        System.out.println(participant);
        return iParticipantService.addParticipant(participant);
    }

    @PutMapping("/update")
    public Participant updateParticipant(@RequestBody Participant participant) {
        System.out.println(participant);
        return iParticipantService.updateParticipant(participant);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteParticipant(@PathVariable int id) {
        iParticipantService.deleteParticipant(id);
        return "Participant deleted successfully";
    }

    @GetMapping("/get-by-id/{id}")
    public Participant getById(@PathVariable int id) {
        return iParticipantService.getParticipantById(id);
    }

    @GetMapping("/get-all")
    public List<Participant> getAllParticipant() {
        return iParticipantService.getAllParticipant();
    }


}
