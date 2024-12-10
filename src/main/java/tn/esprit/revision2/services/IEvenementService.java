package tn.esprit.revision2.services;

import tn.esprit.revision2.entities.Evenement;

import java.util.List;

public interface IEvenementService {
    Evenement addEvenement(Evenement evenement);

    Evenement updateEvenement(Evenement evenement);

    Evenement getEvenementById(int id);

    List<Evenement> getAllEvenement();

    void deleteEvenement(int id);
}
