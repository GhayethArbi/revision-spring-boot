package tn.esprit.revision2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.revision2.entities.Participant;

public interface ParticipantRepository extends JpaRepository<Participant, Integer> {
}
