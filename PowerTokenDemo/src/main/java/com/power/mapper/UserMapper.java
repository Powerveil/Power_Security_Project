package com.power.mapper;

import com.power.domain.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author power
* @description 针对表【sys_user(用户表)】的数据库操作Mapper
* @createDate 2023-01-10 10:53:15
* @Entity com.power.entity.User
*/
public interface UserMapper extends BaseMapper<User> {

}




