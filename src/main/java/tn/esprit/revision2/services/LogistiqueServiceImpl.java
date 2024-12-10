package tn.esprit.revision2.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.revision2.entities.Logistique;
import tn.esprit.revision2.repositories.LogistiqueRepository;

import java.util.List;


@Service
@AllArgsConstructor
public class LogistiqueServiceImpl implements ILogistiqueService {
    @Autowired
    LogistiqueRepository logistiqueRepository;

    @Override
    public Logistique addLogistique(Logistique logistique) {
        return logistiqueRepository.save(logistique);
    }

    @Override
    public Logistique updateLogistique(Logistique logistique) {
        return logistiqueRepository.save(logistique);
    }

    @Override
    public Logistique getLogistiqueById(int id) {
        return logistiqueRepository.findById(id).get();
    }

    @Override
    public List<Logistique> getAllLogistique() {
        return logistiqueRepository.findAll();
    }

    @Override
    public void deleteLogistique(int id) {
        logistiqueRepository.deleteById(id);
    }
}
