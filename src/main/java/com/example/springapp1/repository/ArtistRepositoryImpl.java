package com.example.springapp1.repository;
import com.example.springapp1.database.Artist;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@Component
public class ArtistRepositoryImpl implements ArtistRepository{

    @Override
    public List<Artist> findAll() {
        return Artist.getArtist();
    }

    @Override
    public Optional<Artist> findByTeacher(String teacher) {
        return Optional.empty();
    }

    @Override
    public Optional<Artist> findById(int id) {
        return Optional.empty();
    }

    @Override
    public Optional<Artist> findByCabinet(int cabinet) {
        return Optional.empty();
    }
}
