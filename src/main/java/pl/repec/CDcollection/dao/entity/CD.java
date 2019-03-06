package pl.repec.CDcollection.dao.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CD {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    private String artist;
    private String album;
    private String location;

    public CD() {
    }

    public CD(long id, String artist, String album, String location) {
        this.id = id;
        this.artist = artist;
        this.album = album;
        this.location = location;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
