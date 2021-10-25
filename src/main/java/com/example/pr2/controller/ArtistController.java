//package com.example.pr2.controller;
//
//import com.example.pr2.db.Artist;
//import com.example.pr2.service.ArtistService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//
//public class ArtistController {
//    @Autowired
//    ArtistService artistService;
//
////    @GetMapping("/artist")
////    private List<Artist> getAllArtist()
////    {
////        return artistService.getAllArtist();
////    }
////
////    @GetMapping("/artist/{id}")
////    private Artist getArtist(@PathVariable("id") long id)
////    {
////        return artistService.getArtistById(id);
////    }
////
////    @DeleteMapping("/artist/{id}")
////    private void deleteArtist(@PathVariable("id") long id)
////    {
////        artistService.delete(id);
////    }
////
////    @PostMapping("/artist")
////    private long saveArtist(@RequestBody Artist artist)
////    {
////        artistService.saveOrUpdate(artist);
////        return artist.getId();
////    }
//}
