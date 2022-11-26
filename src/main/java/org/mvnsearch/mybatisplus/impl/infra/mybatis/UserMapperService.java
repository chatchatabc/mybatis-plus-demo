package org.mvnsearch.mybatisplus.impl.infra.mybatis;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.mvnsearch.mybatisplus.domain.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserMapperService extends ServiceImpl<UserMapper, User> {
}
