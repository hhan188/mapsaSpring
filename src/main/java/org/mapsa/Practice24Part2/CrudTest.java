package org.mapsa.Practice24Part2;


import org.mapsa.SessionFactoryProvider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class CrudTest {
    public static void main(String[] args) throws Exception {
        ArtistService artistService = new ArtistService(SessionFactoryProvider.getSessionFactory());

        SongService songService = new SongService(SessionFactoryProvider.getSessionFactory());

        Artist artist1 = new Artist("Ali", "I am 30", "Iranian");
        Artist artist2 = new Artist("Ehsan", "I am 26", "Iranian");

        Artist_Detail artistDetail1 = new
                Artist_Detail("www.ali.com", "AliHAjEsmaeli", 2, 5,
                "Santoor");
        Artist_Detail artistDetail2 = new
                Artist_Detail("www.ehsan.com", "EhsanShademani", 5, 10,
                "Guitar");

        Album album1 = new Album("Sad", new Date());
        Album album2 = new Album("Happy", new Date());

        Song song1 = new Song("Adele", "4:30", new Date(), "Sad", "alaki1");
        Song song2 = new Song("Googoosh", "6:40", new Date(), "Happy", "Alaki2");
        List<Song> songs = new ArrayList<>();
        songs.add(song1);
        songs.add(song2);
        album1.setSongs(songs);
        album2.setSongs(songs);
        List<Album> albums = new ArrayList<>();
        albums.add(album1);
        albums.add(album2);
        artist1.setArtistDetail(artistDetail1);
        artist2.setArtistDetail(artistDetail2);
        songService.create(song1);
        songService.create(song2);
        artistService.create(artist1);
        artistService.create(artist2);


    }
}
