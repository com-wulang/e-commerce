package com.cq.springboot.Dao;

import com.cq.springboot.Model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: chenqiang
 * @Date: 2018/10/26 16:04
 * @Version 1.0
 */
@Repository
public interface UserDao {
    List<User> getAllUser();
}
