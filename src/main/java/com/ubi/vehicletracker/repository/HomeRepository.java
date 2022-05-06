package com.ubi.vehicletracker.repository;

import org.springframework.stereotype.Repository;

@Repository
public class HomeRepository {

    private String url;

    public HomeRepository() {
        this.url = "db-url";
    }

    public String getUrl() {
        return url;
    }
}
