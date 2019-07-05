package com.wys.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "address")
@Setter
@Getter
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addId;
    private String addName;
    private String ades;

    @Override
    public String toString() {
        return "Address{" +
                "addId=" + addId +
                ", addName='" + addName + '\'' +
                ", ades='" + ades + '\'' +
                '}';
    }
}
