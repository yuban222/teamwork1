package com.dp.teamwork1.dao;

import com.dp.teamwork1.entity.user;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface userdao {
    void add(user user);

    boolean login(user user);

}
