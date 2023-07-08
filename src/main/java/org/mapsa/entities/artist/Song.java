package org.mapsa.entities.artist;

import lombok.Data;
import javax.persistence.*;


@Entity
@Data
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer songId;
    @Column(name = "title")
    private String title;
    @Column(name="duration")
    private Integer Duration;
    @Column(name="releaseDate")
    private String Date;
    @Column(name = "genre")
    private String genre;
    @Column(name ="filePath")
    private String filePath;


}
