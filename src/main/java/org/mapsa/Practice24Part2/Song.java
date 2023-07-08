package org.mapsa.Practice24Part2;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
public class Song implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "song_id")
    private Integer songId;
    @Column(name = "title")
    private String title;
    @Column(name = "duration")
    private String duration;
    @Column(name = "release_date")
    @Temporal(TemporalType.DATE)
    private Date releaseDate;
    @Column(name = "genre")
    private String genre;
    @Column(name = "file_path")
    private String filePath;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "album_id")
    private Album album;

    public Song(String title, String duration, Date releaseDate, String genre, String filePath)
    {
        this.title = title;
        this.duration = duration;
        this.releaseDate = releaseDate;
        this.genre = genre;
        this.filePath = filePath;
    }

       @Override
    public String toString()
    {
        return "Song{" +
                "songId=" + songId +
                ", title='" + title + '\'' +
                ", duration='" + duration + '\'' +
                ", releaseDate=" + releaseDate +
                ", genre='" + genre + '\'' +
                ", filePath='" + filePath + '\'' +
                ", album=" + album +
                '}';
    }
}
