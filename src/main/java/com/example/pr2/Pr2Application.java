package com.example.pr2;
import com.example.pr2.Repository.ArtistRepository;
import com.example.pr2.db.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController

public class Pr2Application {
    @Autowired
    private ArtistRepository artistRep;
//    @Autowired
//    ArtistService artistService;
    public static void main(String[] args) {
        SpringApplication.run(Pr2Application.class, args);
    }

    @Bean
    public CommandLineRunner run(ArtistRepository repository){
        return (args -> {
            insertArtist(repository);
            System.out.println(repository.findAll());
        });
    }


    private void insertArtist(ArtistRepository repository){
        repository.save(new Artist(1,"Kairat Nurtas","pop","Kazakhsat","kz"));
        repository.save(new Artist(2,"Jimi Hendrix","Blues rock","USA", "Reprise Records"));
        repository.save(new Artist(3,"Slim Shady","hip-hop","USA","Reprise Records"));
        repository.save(new Artist(4,"Brandon Flowers","synth-pop","USA","Island"));
        repository.save(new Artist(5,"Galymzhan Moldanazar","synth-pop","Kazakhstan","MOLDANAZAR"));
        repository.save(new Artist(6,"Damond Albarnn","Brit-pop","Great Britain","Food"));
    }

}
