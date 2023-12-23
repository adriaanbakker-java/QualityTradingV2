package nl.qualitytrading.backend.service.backend;

import nl.qualitytrading.backend.repository.DatabasenaamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BackendService {

    @Autowired
    private DatabasenaamRepository databasenaamRepository;


    public String geefDatabasenaam() {
        return databasenaamRepository.getNaam();
    }
}
