package org.mapsa.Practice24Part2;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Album implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "album_id")
    private Integer albumId;
    @Column(name = "title")
    private String title;
    @Column(name = "release_date")
    @Temporal(TemporalType.DATE)
    private Date releaseDate;
    @OneToMany(mappedBy = "album")
    private List<Song> songs = new ArrayList<>();
    @ManyToMany
    @JoinTable(name = "Artist_Album" ,
            joinColumns = @JoinColumn(name = "album_id") , inverseJoinColumns = @JoinColumn(name = "artist_id"))
    private List<Artist> artists = new ArrayList<>();
    public Album(String title, Date releaseDate)
    {
        this.title = title;
        this.releaseDate = releaseDate;
    }
    @Override
    public String toString()
    {
        return "Album{" +
                "albumId=" + albumId +
                ", title='" + title + '\'' +
                ", releaseDate=" + releaseDate +
                ", songs=" + songs +
                ", artists=" + artists +
                '}';
    }
}
