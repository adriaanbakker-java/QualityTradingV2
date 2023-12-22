package com.mkyong.service;

import com.mkyong.repository.DatabasenaamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private DatabasenaamRepository databasenaamRepository;


    public String geefDatabasenaam() {
        return databasenaamRepository.getNaam();
    }
}
