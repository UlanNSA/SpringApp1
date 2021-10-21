package com.example.springapp1;

import com.example.springapp1.database.Artist;
import com.example.springapp1.repository.ArtistRepository;
import com.example.springapp1.repository.ArtistRepositoryImpl;
import com.example.springapp1.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class SpringApp1Application {

    private static ArtistService service;
    @Autowired
    public void setService(ArtistService service){
        SpringApp1Application.service = service;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringApp1Application.class, args);
        service.getAll().forEach(System.out::println);

    }

}



