package com.wys.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "course")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cid;
    private String cname;

    @ManyToMany()
    @JoinTable(
            name = "cou_stu",
            joinColumns = {@JoinColumn(name = "cid",referencedColumnName = "cid")},
            inverseJoinColumns = {@JoinColumn(name = "stuid",referencedColumnName = "stuid")}
    )
    private List<Student> studentList;

    @Override
    public String toString() {
        return "Course{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", studentList=" + "" +
                '}';
    }
}
