package org.mapsa.Practice24Part1;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Author implements Serializable
{
    @Id
    @Column(name = "author_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer authorId;
    @Column(name = "name")
    private String name;
    @Column(name = "birth_day")
    @Temporal(TemporalType.DATE)
    private Date birthDay;
    @OneToOne(mappedBy = "author" , cascade = CascadeType.ALL)
    private Author_Detail authorDetail;
    @OneToMany(mappedBy = "author" , cascade = CascadeType.ALL)
    private List<Post> posts = new ArrayList<>();

    public Author(String name, Date birthDay)
    {
        this.name = name;
        this.birthDay = birthDay;
    }
    public Author(){
        
    }


}
