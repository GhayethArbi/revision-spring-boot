package tn.esprit.revision2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.revision2.entities.Evenement;

public interface EvenementRepository extends JpaRepository<Evenement, Integer> {

}
