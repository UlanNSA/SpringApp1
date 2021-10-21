package com.example.springapp1.database;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Track {
    private int trackId;
    private int albumsId;
    private int trackNum;
    private String title;
    private String length;


    public Track() {
    }

    public static Track.SongBuilder songBuilder() {
        return new Track().new SongBuilder();
    }


    public class   SongBuilder {
        private  SongBuilder() {
        }

        public  Track.SongBuilder trackId(int trackId) {
            Track.this.trackId = trackId;
            return this;
        }

        public  Track.SongBuilder albumsId(int albumsId) {
            Track.this.albumsId = albumsId;
            return this;
        }

        public  Track.SongBuilder trackNum(int trackNum) {
            Track.this.trackNum = trackNum;
            return this;
        }

        public  Track.SongBuilder title(String title) {
            Track.this.title = title;
            return this;
        }

        public  Track.SongBuilder length(String length) {
            Track.this.length = length;
            return this;
        }

        public Track build() {
            return Track.this;
        }
    }

    public static List<Track> getSong(){
        Track song1 = Track.songBuilder()
                .trackId(1101)
                .albumsId(101)
                .trackNum(16)
                .title("All along the watchtower")
                .length("3:56")
                .build();

        Track song2 = Track.songBuilder()
                .trackId(1102)
                .albumsId(101)
                .trackNum(16)
                .title("Long hot summer night")
                .length("3:30")
                .build();

        Track song3 = Track.songBuilder()
                .trackId(1103)
                .albumsId(101)
                .trackNum(16)
                .title("Voodoo chile")
                .length("5:14")
                .build();

        Track song4 = Track.songBuilder()
                .trackId(1201)
                .albumsId(201)
                .trackNum(20)
                .title("Godzilla")
                .length("3:33")
                .build();

        Track song5 = Track.songBuilder()
                .trackId(1202)
                .albumsId(201)
                .trackNum(20)
                .title("Yah Yah")
                .length("4:48")
                .build();

        Track song6 = Track.songBuilder()
                .trackId(1203)
                .albumsId(201)
                .trackNum(20)
                .title("Darkness")
                .length("6:09")
                .build();

        Track song7 = Track.songBuilder()
                .trackId(1301)
                .albumsId(301)
                .trackNum(1)
                .title("Mr.Brightside")
                .length("3:43")
                .build();

        Track song8 = Track.songBuilder()
                .trackId(1302)
                .albumsId(301)
                .trackNum(11)
                .title("Change Your Mind")
                .length("3:11")
                .build();

        Track song9 = Track.songBuilder()
                .trackId(1303)
                .albumsId(301)
                .trackNum(11)
                .title("Somebody Told Me")
                .length("3:21")
                .build();

        Track song10 = Track.songBuilder()
                .trackId(1304)
                .albumsId(301)
                .trackNum(11)
                .title("On Top")
                .length("4:20")
                .build();

        Track song11 = Track.songBuilder()
                .trackId(1305)
                .albumsId(302)
                .trackNum(15)
                .title("Be Still")
                .length("4:33")
                .build();

        Track song12 = Track.songBuilder()
                .trackId(1306)
                .albumsId(302)
                .trackNum(15)
                .title("Runaways")
                .length("4:16")
                .build();

        Track song13 = Track.songBuilder()
                .trackId(1401)
                .albumsId(401)
                .trackNum(14)
                .title("song 2")
                .length("3:01")
                .build();

        Track song14 = Track.songBuilder()
                .trackId(1402)
                .albumsId(401)
                .trackNum(14)
                .title("Movin' on")
                .length("3:34")
                .build();

        Track song15 = Track.songBuilder()
                .trackId(1403)
                .albumsId(402)
                .trackNum(12)
                .title("Ghost Ship")
                .length("4:32")
                .build();

        Track song16 = Track.songBuilder()
                .trackId(1404)
                .albumsId(402)
                .trackNum(12)
                .title("Go Out")
                .length("Pyongyang")
                .build();

        Track song17 = Track.songBuilder()
                .trackId(1501)
                .albumsId(501)
                .trackNum(21)
                .title("Vietnam")
                .length("4:03")
                .build();

        Track song18 = Track.songBuilder()
                .trackId(1502)
                .albumsId(501)
                .trackNum(21)
                .title("Pool")
                .length("4:03")
                .build();

        Track song19 = Track.songBuilder()
                .trackId(1503)
                .albumsId(502)
                .trackNum(12)
                .title("Petersburg roofs")
                .length("3:34")
                .build();

        Track song20 = Track.songBuilder()
                .trackId(1504)
                .albumsId(502)
                .trackNum(12)
                .title("Rake")
                .length("3:48")
                .build();

        return Arrays.asList(song1, song2, song3, song4, song5,
                song6, song7, song8, song9, song10,
                song11, song12, song13, song14, song15,
                song16,song17,song18,song19,song20);

    }

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public int getAlbumsId() {
        return albumsId;
    }

    public void setAlbumsId(int albumsId) {
        this.albumsId = albumsId;
    }

    public int getTrackNum() {
        return trackNum;
    }

    public void setTrackNum(int trackNum) {
        this.trackNum = trackNum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }
}

