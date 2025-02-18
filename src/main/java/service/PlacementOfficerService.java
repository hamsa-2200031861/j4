package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.PlacementOfficer;
import repository.PlacementOfficerRepository;

@Service
public class PlacementOfficerService {

    @Autowired
    private PlacementOfficerRepository placementOfficerRepository;

    public void savePlacementOfficer(PlacementOfficer placementOfficer) {
        placementOfficerRepository.save(placementOfficer);
    }

    public PlacementOfficer findOfficerByEmailAndPassword(String email, String password) {
        return placementOfficerRepository.findByEmailAndPassword(email, password);
    }
}