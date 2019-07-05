package com.wys.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "student")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer stuid;
    private String stuname;

    @ManyToMany()
    @JoinTable(
            name = "cou_stu",
            joinColumns = {@JoinColumn(name = "stuid",referencedColumnName = "stuid")},
            inverseJoinColumns = {@JoinColumn(name = "cid",referencedColumnName = "cid")}
    )
    private List<Course> courseList;

    @Override
    public String toString() {
        return "Student{" +
                "stuid=" + stuid +
                ", stuname='" + stuname + '\'' +
                ", courseList=" + courseList +
                '}';
    }
}
