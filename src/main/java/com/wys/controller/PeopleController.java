package com.wys.controller;

import com.wys.entity.People;
import com.wys.repository.PeopleRepository;
import com.wys.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PeopleController {

    @Autowired
    private PeopleService peopleService;

    @Autowired
    private PeopleRepository peopleRepository;

    @RequestMapping("findAll")
    public List<People> findAll() {
        return peopleService.findAll();
    }

    @RequestMapping("getOne")
    public People getOne() {
        return peopleRepository.getOne(1);
    }


    //插入与更新操作都使用save
    @RequestMapping("save")
    public void save() {
        People people = new People();
        people.setPid(5);
        people.setPname("小甜甜");
        peopleRepository.save(people);
    }

    @RequestMapping("deleteById")
    public void deleteById(Integer pid){
        peopleRepository.deleteById(pid);
    }
}
