package com.wys.repository;

import com.wys.entity.People;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleRepository extends JpaRepository<People,Integer> {

}
