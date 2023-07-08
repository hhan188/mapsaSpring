package org.mapsa.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Data
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;
    private String title;
    @ManyToMany(cascade = {
            CascadeType.ALL} )
    @JoinTable(name = "role_permission" ,
            joinColumns = @JoinColumn(name="r_id" ) ,
            inverseJoinColumns = @JoinColumn(name="p_id"))
    private List<Permission> permissions = new ArrayList<>();

    public Role() {
    }

    public Role(String title) {
        this.title = title;
    }

   }
