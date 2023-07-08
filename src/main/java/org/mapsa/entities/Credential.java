package org.mapsa.entities;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
public class Credential {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;
    @Column(name="user_name")
    private String userName;
    @Column(name="password")
    private String password;

    @OneToOne
    @JoinColumn(name="user_id")
    private User user ;

    public Credential(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Credential() {
    }

}
