package org.mvnsearch.mybatisplus.impl.infra.mybatis;

import org.junit.jupiter.api.Test;
import org.mvnsearch.mybatisplus.SpringBootBaseTest;
import org.mvnsearch.mybatisplus.domain.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linux_china
 */
public class UserMapperTest extends SpringBootBaseTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testFindById() {
        final User user = userMapper.selectById(1);
        System.out.println(user.getName());
    }

    @Test
    public void testOperations() {
        User user = new User();
        user.setAge(18);
        user.setName("linux_china");
        user.setEmail("kyoko_shrefflerbik@john.apw");
        //insert
        userMapper.insert(user);
        System.out.println(user.getId());
        //delete
        userMapper.deleteById(user.getId());
        // query
        assertThat(userMapper.selectById(user.getId())).isNull();
    }
}
