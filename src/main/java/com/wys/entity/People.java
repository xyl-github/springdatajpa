package com.wys.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "people")
@Setter
@Getter
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class People implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pid;

    private String pname;

//    @OneToOne(cascade = CascadeType.ALL)
    @OneToOne()
    @JoinColumn(name = "aid",referencedColumnName = "addId")
    private Address address;

    @Override
    public String toString() {
        return "People{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", address=" + address +
                '}';
    }
}
