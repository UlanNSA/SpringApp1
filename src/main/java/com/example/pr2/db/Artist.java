package com.example.pr2.db;

import javax.persistence.*;

@Entity
@Table(name="ARTIST")
public class Artist{
    @javax.persistence.Id
    @GeneratedValue
    @Column(name="id", nullable = false)
    private long Id;

    @Column(name="name", nullable = false)
    private String fullname;

    @Column(name="genre")
    private String genre;

    @Column(name="country")
    private String country;

    @Column(name="labels")
    private String labels;

    public Artist(long id, String fullname, String genre, String country, String labels) {
        Id = id;
        this.fullname = fullname;
        this.genre = genre;
        this.country = country;
        this.labels = labels;
    }

    public Artist() {
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
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
        return "Artist: " +
                 Id +
                "fullname: " + fullname +
                " genre: " + genre +
                "country: " + country + '\'' +
                "labels: " + labels +"\n";
    }
}
