package tn.esprit.revision2.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.revision2.entities.Evenement;
import tn.esprit.revision2.repositories.EvenementRepository;

import java.util.List;

@Service
@AllArgsConstructor

public class EvenementServiceImpl implements IEvenementService {
    @Autowired
    EvenementRepository evenementRepository;

    @Override
    public Evenement addEvenement(Evenement evenement) {
        return evenementRepository.save(evenement);
    }

    @Override
    public Evenement updateEvenement(Evenement evenement) {
        return evenementRepository.save(evenement);
    }

    @Override
    public Evenement getEvenementById(int id) {
        return evenementRepository.findById(id).get();
    }

    @Override
    public List<Evenement> getAllEvenement() {
        return evenementRepository.findAll();
    }

    @Override
    public void deleteEvenement(int id) {
        evenementRepository.deleteById(id);
    }
}
