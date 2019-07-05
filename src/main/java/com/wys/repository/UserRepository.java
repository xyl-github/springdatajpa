package com.wys.repository;

import com.wys.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    public List<User> getAllByUsernameLike(String username);

    public User getUserByUidAndUsername(Long uid, String username);

    @Query("from User")
    public List<User> getAll1();

    @Query("select u from User u where u.uid = ?1")
    public User getUserById(Integer uid);

//    @Query("select u from User u where u.uid=?1 and u.username=?2")
//    public User getUserByIdAndName(Integer uid, String username);

    @Query("select u from User u where u.uid=:id and u.username like %:name1%")
    public User getUserByIdAndName(@Param("id")Integer uid, @Param("name1")String username);

    @Query("UPDATE User set username=?2 where uid=?1")
    @Modifying
    public void updateUser(Integer uid, String username);

    @Query(value = "insert into `user`(username,money) values(?1,?2)", nativeQuery = true)
    @Modifying
    public void addUser(String username, Double money);

    @Query(value = "update `user` set username = ?2 , money = ?3 where uid = ?1", nativeQuery = true)
    @Modifying
    public void updateUser1(Integer uid, String username, Double money);

    @Query(value = "select * from user u where u.uid=?1 and u.username like ?2",nativeQuery = true)
    public User getUser1By(Integer uid,String username);
}
