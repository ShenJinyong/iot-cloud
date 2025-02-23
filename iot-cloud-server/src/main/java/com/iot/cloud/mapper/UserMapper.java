package com.iot.cloud.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.iot.cloud.pojo.po.UserPO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @InterfaceName UserMapper
 * @Description TODO 系统用户Mapper接口
 * @Author 沈金勇
 * @Email 438217638@qq.com
 * @Date 2025/2/23 15:22
 */
@Mapper
public interface UserMapper extends BaseMapper<UserPO> {

}