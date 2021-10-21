package com.example.springapp1.repository;


import com.example.springapp1.database.Artist;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface ArtistRepository {
    List<Artist> findAll();

    Optional<Artist> findByTeacher(String teacher);

    Optional<Artist> findById(int id);

    Optional<Artist> findByCabinet(int cabinet);
}

