package com.ubi.vehicletracker.controller;

import com.ubi.vehicletracker.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    private HomeService service;

    @Value("${app.database.name}")
    String databaseName;

    @Autowired
    public HomeController(HomeService service) {
        this.service = service;
    }

    @GetMapping("/greet")
    public String sayHello() {
        return "Hello";
    }

    @GetMapping("/dbname")
    public String getDbName() {
        return databaseName;
    }

    @GetMapping("/url")
    public String getDbUrl() {
        return service.getUrl();
    }

}
