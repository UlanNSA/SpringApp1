package com.example.springapp1.service;


import com.example.springapp1.database.Artist;
import com.example.springapp1.repository.ArtistRepository;
import com.example.springapp1.repository.ArtistRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ArtistService {
    private final ArtistRepository artistRepository;
    @Autowired
    public ArtistService(ArtistRepository artistRepository){
        this.artistRepository = artistRepository;
    }

    public List<Artist> getAll(){
        return artistRepository.findAll();
    }
}
