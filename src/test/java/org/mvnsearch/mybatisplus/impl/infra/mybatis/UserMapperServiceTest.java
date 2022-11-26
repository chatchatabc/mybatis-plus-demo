package org.mvnsearch.mybatisplus.impl.infra.mybatis;

import org.junit.jupiter.api.Test;
import org.mvnsearch.mybatisplus.SpringBootBaseTest;
import org.mvnsearch.mybatisplus.domain.model.User;
import org.springframework.beans.factory.annotation.Autowired;

public class UserMapperServiceTest extends SpringBootBaseTest {
    @Autowired
    private UserMapperService userMapperService;
    @Test
    public void testFindById() {
        final User user = userMapperService.getById(1);
        System.out.println(user.getName());
    }
}
