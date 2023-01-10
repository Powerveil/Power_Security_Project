package com.power.mapper;

import com.power.domain.entity.User;
import com.power.mapper.UserMapper;
import com.power.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author power
 * @Date 2023/1/10 10:56
 */
@SpringBootTest
public class MapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testUserMapper() {
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }
}
