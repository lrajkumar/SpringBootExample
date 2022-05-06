package com.ubi.vehicletracker.service;

import com.ubi.vehicletracker.repository.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeService {

    private final HomeRepository repository;

    @Autowired
    public HomeService(HomeRepository repository) {
        this.repository = repository;
    }

    public String getUrl() {
        return repository.getUrl();
    }

}
