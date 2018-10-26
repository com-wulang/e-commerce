package com.cq.springboot.Service.Ipm;

import com.cq.springboot.Dao.UserDao;
import com.cq.springboot.Model.User;
import com.cq.springboot.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: chenqiang
 * @Date: 2018/10/26 16:06
 * @Version 1.0
 */
@Service
public class UserServiceIpm implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public List<User> getAllUser() {
        return userDao.getAllUser();
    }
}
