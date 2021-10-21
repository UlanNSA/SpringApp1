package com.example.springapp1.database;


import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
@Component
public class Artist {
    private int artistId;
    private String firstName;
    private String lastName;
    private String genre;
    private String country;
    private String labels;

    public Artist() {
    }

    public static ArtistBuilder artistBuilder() {
        return new Artist().new ArtistBuilder();
    }

    public class  ArtistBuilder {
        private ArtistBuilder() {
        }
        public Artist.ArtistBuilder artistId(int artistId) {
            Artist.this.artistId= artistId;
            return this;
        }

        public Artist.ArtistBuilder fname(String fname) {
            Artist.this.firstName = fname;
            return this;
        }

        public Artist.ArtistBuilder lname(String lname) {
            Artist.this.lastName = lname;
            return this;
        }

        public Artist.ArtistBuilder genre(String genre) {
            Artist.this.genre = genre;
            return this;
        }

        public Artist.ArtistBuilder country(String country) {
            Artist.this.country = country;
            return this;
        }

        public Artist.ArtistBuilder labels(String labels) {
            Artist.this.labels = labels;
            return this;
        }
        public Artist build() {
            return Artist.this;
        }
    }

    public static List<Artist> getArtist(){
        Artist artist1 = Artist.artistBuilder()
                .artistId(1)
                .lname("Hendrix")
                .fname("Jimi")
                .genre("Blues rock")
                .country("USA")
                .labels("Reprise Records")
                .build();

        Artist artist2 = Artist.artistBuilder()
                .artistId(2)
                .lname("Shady")
                .fname("Slim")
                .genre("hip-hop")
                .country("USA")
                .labels("Reprise Records")
                .build();

        Artist artist3 = Artist.artistBuilder()
                .artistId(3)
                .lname("Flowers")
                .fname("Brandon")
                .genre("synth-pop")
                .country("USA")
                .labels("Island")
                .build();

        Artist artist4 = Artist.artistBuilder()
                .artistId(4)
                .lname("Albarnn")
                .fname("Damo")
                .genre("Brit-pop")
                .country("Great Britain")
                .labels("Food")
                .build();

        Artist artist5 = Artist.artistBuilder()
                .artistId(5)
                .lname("A.Alekseev")
                .fname("Ivan")
                .genre("hip-hop")
                .country("Russia")
                .labels("Universal Music")
                .build();

        Artist artist6 = Artist.artistBuilder()
                .artistId(6)
                .lname("Elijah Ahr")
                .fname("Gustav")
                .genre("hip-hop")
                .country("Sweden")
                .labels("First Access")
                .build();

        Artist artist7 = Artist.artistBuilder()
                .artistId(7)
                .lname("Moldanazar")
                .fname("Galymzhan")
                .genre("synth-pop")
                .country("Kazakhstan")
                .labels("MOLDANAZAR")
                .build();

        return Arrays.asList(artist1, artist2, artist2, artist3, artist4, artist5, artist6, artist7);
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "artistId=" + artistId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", genre='" + genre + '\'' +
                ", country='" + country + '\'' +
                ", labels='" + labels + '\'' +
                '}';
    }
}

