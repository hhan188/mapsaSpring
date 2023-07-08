package org.mapsa.Practice24Part1;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Category
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Integer categoryId;
    @Column(name = "title")
    private String title;
    @ManyToMany(cascade = {CascadeType.DETACH , CascadeType.MERGE , CascadeType.PERSIST , CascadeType.REFRESH})
    @JoinTable(name = "Post_Category" ,
            joinColumns  = @JoinColumn(name = "category_id") , inverseJoinColumns = @JoinColumn(name = "post_id"))
    private List<Post> posts = new ArrayList<>();

    public Category(String title)
    {
        this.title = title;
    }


}
