package com.bingo.dds.mapper;

import com.bingo.dds.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * UserMapper
 * Author: bingo
 */
@Mapper
public interface UserMapper {

    public List<User> findAll();
}
