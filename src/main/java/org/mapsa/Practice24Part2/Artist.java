package org.mapsa.Practice24Part2;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Entity
@Data
public class Artist implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "artist_id")
    private Integer artistId;
    @Column(name = "name")
    private String name;
    @Column(name = "bio")
    private String bio;
    @Column(name = "nationality")
    private String nationality;
    @OneToOne(mappedBy = "artist" , cascade = CascadeType.ALL)
    private Artist_Detail artistDetail;
    @ManyToMany(mappedBy = "artists" ,
            cascade = {CascadeType.DETACH , CascadeType.MERGE , CascadeType.PERSIST , CascadeType.REFRESH})
    private List<Album> albums = new ArrayList<>();

    public Artist(String name, String bio, String nationality)
    {
        this.name = name;
        this.bio = bio;
        this.nationality = nationality;
    }


    @Override
    public String toString()
    {
        return "Artist{" +
                "artistId=" + artistId +
                ", name='" + name + '\'' +
                ", bio='" + bio + '\'' +
                ", nationality='" + nationality + '\'' +
                ", artistDetail=" + artistDetail +
                ", albums=" + albums +
                '}';
    }
}
