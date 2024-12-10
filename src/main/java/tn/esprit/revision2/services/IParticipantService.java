package tn.esprit.revision2.services;

import tn.esprit.revision2.entities.Participant;

import java.util.List;

public interface IParticipantService {
    Participant addParticipant(Participant participant);

    Participant updateParticipant(Participant participant);

    Participant getParticipantById(int id);

    List<Participant> getAllParticipant();

    void deleteParticipant(int id);
}
