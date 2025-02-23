package com.iot.cloud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.iot.cloud.mapper.UserMapper;
import com.iot.cloud.pojo.po.UserPO;
import com.iot.cloud.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Description TODO 系统用户服务层
 * @Author 沈金勇
 * @Email 438217638@qq.com
 * @Date 2025/2/23 15:25
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserPO> implements UserService {

}
