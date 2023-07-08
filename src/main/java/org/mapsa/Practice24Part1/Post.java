package org.mapsa.Practice24Part1;

import lombok.Data;

import javax.persistence.*;
import java.sql.Time;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private Integer postId;
    @Column(name = "content")
    private String content;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;
    @ManyToMany(mappedBy = "posts")
    private List<Category> categories = new ArrayList<>();
    @Column
    private Boolean publish;
    @Column
    @Temporal(TemporalType.DATE)
    private Date publishDate;
    @Column
    @Temporal(TemporalType.TIME)
    private Time publishTime;
    @Column
    private LocalDateTime createDate;
    @Transient
    private Duration age;

    public Post(String content) {
        this.content = content;
    }

    public Duration getAge() {
        if (publish == false) {
            return null;
        }

        return Duration.between(LocalDateTime.now(), createDate);
    }
}
