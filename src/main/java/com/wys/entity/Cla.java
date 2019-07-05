package com.wys.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "cla")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class Cla {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cid;
    private String cname;
//  mappedBy由谁来管理关联关系 表示放弃管理关联关系
    @OneToMany(mappedBy = "cla")
//    @JoinColumn(name = "cla_id",referencedColumnName = "cid")
    private List<User> userList;

    @Override
    public String toString() {
        return "Cla{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", userList=" + userList +
                '}';
    }
}
