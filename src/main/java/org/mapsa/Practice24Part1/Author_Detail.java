package org.mapsa.Practice24Part1;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class Author_Detail
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_detail_id")
    private Integer author_detail_id;
    @Column(name = "bio")
    private String bio;
    @OneToOne
    @JoinColumn(name = "author_id")
    private Author author;

    public Author_Detail(String bio)
    {
        this.bio = bio;
    }


}
