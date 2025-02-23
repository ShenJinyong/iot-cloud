package com.iot.cloud.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.iot.cloud.pojo.po.UserPO;

/**
 * @InterfaceName UserService
 * @Description TODO 用户服务类接口
 * @Author 沈金勇
 * @Email 438217638@qq.com
 * @Date 2025/2/23 15:24
 */
public interface UserService extends IService<UserPO> {

    Page<UserPO> page(long current,long limit);

}
