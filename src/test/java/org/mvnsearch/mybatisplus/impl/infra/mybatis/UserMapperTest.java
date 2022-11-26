package org.mvnsearch.mybatisplus.impl.infra.mybatis;

import org.junit.jupiter.api.Test;
import org.mvnsearch.mybatisplus.SpringBootBaseTest;
import org.mvnsearch.mybatisplus.domain.model.User;
import org.springframework.beans.factory.annotation.Autowired;

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
}
