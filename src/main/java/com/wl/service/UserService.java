package com.wl.service;

import com.wl.model.User;

import java.util.List;

/**
 * @Description:
 * @Auther:wangliang
 * @Date:2021/2/4 8:45
 */
public interface UserService {
    List<User> findUsers();

    String sayHi(String name);
}
