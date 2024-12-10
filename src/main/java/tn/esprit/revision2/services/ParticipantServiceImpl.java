package tn.esprit.revision2.services;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.revision2.entities.Participant;
import tn.esprit.revision2.repositories.ParticipantRepository;

import java.util.List;


@Service
@AllArgsConstructor
@NoArgsConstructor
public class ParticipantServiceImpl implements IParticipantService {
    @Autowired
    ParticipantRepository participantRepository;


    @Override
    public Participant addParticipant(Participant participant) {
        return participantRepository.save(participant);
    }

    @Override
    public Participant updateParticipant(Participant participant) {
        return participantRepository.save(participant);
    }

    @Override
    public Participant getParticipantById(int id) {
        return participantRepository.findById(id).get();
    }

    @Override
    public List<Participant> getAllParticipant() {
        return participantRepository.findAll();
    }

    @Override
    public void deleteParticipant(int id) {
        participantRepository.deleteById(id);
    }
}
