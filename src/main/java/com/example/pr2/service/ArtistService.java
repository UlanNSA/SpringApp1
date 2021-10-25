//package com.example.pr2.service;
//
//import com.example.pr2.Repository.ArtistRepository;
//import com.example.pr2.db.Artist;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class ArtistService {
//
//    @Autowired
//    ArtistRepository artistRepository;
//    //getting all student records
//    public List<Artist> getAllArtist()
//    {
//        List<Artist> artists = new ArrayList<Artist>();
//        artistRepository.findAll().forEach(artists::add);
//        return artists;
//    }
//    //getting a specific record
//    public Artist getArtistById(long id)
//    {
//        return artistRepository.findById(id).get();
//    }
//    public void saveOrUpdate(Artist student)
//    {
//        artistRepository.save(student);
//    }
//    //deleting a specific record
//    public void delete(long id)
//    {
//        artistRepository.deleteById(id);
//    }
//}
