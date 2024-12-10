package tn.esprit.revision2.services;

import tn.esprit.revision2.entities.Logistique;

import java.util.List;

public interface ILogistiqueService {
    Logistique addLogistique(Logistique logistique);

    Logistique updateLogistique(Logistique logistique);

    Logistique getLogistiqueById(int id);

    List<Logistique> getAllLogistique();

    void deleteLogistique(int id);
}
