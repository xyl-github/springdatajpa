package com.wys;

import com.wys.entity.People;
import com.wys.entity.User;
import com.wys.repository.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;


@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
@Rollback(false)
public class SpringdatajpaApplicationTests {

    @Autowired
    private PeopleRepository peopleRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private ClaRepository claRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void contextLoads1() {
        System.out.println(claRepository.findAll());
//        System.out.println(studentRepository.findAll());
    }

    @Test
    public void contextLoads() {
//        System.out.println(peopleRepository.findAll());
//        System.out.println(peopleRepository.getOne(1));
        peopleRepository.deleteById(1);
    }

    @Test
    public void contextLoads2() {
        System.out.println(courseRepository.findAll());
    }

    @Test
    public void test() {
//        System.out.println(userRepository.getAllByUsernameLike("%T%"));
//        System.out.println(userRepository.getUserByUidAndUsername((long)1,"Jack"));
//        System.out.println(userRepository.findAll());
        System.out.println(userRepository.getAll1());
//        System.out.println(userRepository.getUserById(1));
//        System.out.println(userRepository.getUserByIdAndName(1, "露娜"));
//        userRepository.updateUser(1,"小明");
//        userRepository.flush();
//        userRepository.addUser("露娜我爱你",10000.00);
//        userRepository.flush();
//        userRepository.updateUser1(1,"露娜我爱你",10000.00);
//        userRepository.flush();
//        User user = userRepository.getUser1By(1, "%我爱%");
//        userRepository.flush();
//        System.out.println(user);
    }

    @Test
    public void test1() {
        People people = new People();
        people.setPid(12);
        people.setPname("小美眉");
        peopleRepository.save(people);
    }

    @Test
    public void test2() {
        System.out.println(addressRepository.findAll());
    }

}
