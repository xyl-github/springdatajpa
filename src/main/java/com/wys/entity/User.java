package com.wys.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer uid;
    @Column(name = "username",unique = false,nullable = true,length = 50)
    private String username;
    private double money;

    @ManyToOne(targetEntity = Cla.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "cla_id",referencedColumnName = "cid")
    private Cla cla;

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", money=" + money +
                ", cla=" + "" +
                '}';
    }
}
