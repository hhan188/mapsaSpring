package org.mapsa.entities;


import lombok.Data;
import org.mapsa.entities.Address;
import org.mapsa.entities.Credential;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @OneToOne(mappedBy = "user",cascade = CascadeType.ALL)
    private Credential credential ;

    @OneToMany(mappedBy = "user" , cascade = CascadeType.ALL)
    private List<Address> addresses = new ArrayList<>();


    public User() {
    }

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


}
