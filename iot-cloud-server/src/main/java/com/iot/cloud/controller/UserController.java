package com.iot.cloud.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.iot.cloud.common.ApiResponse;
import com.iot.cloud.pojo.po.UserPO;
import com.iot.cloud.service.impl.UserServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName UserController
 * @Description TODO 系统用户控制层
 * @Author 沈金勇
 * @Email 438217638@qq.com
 * @Date 2025/2/23 15:28
 */
@RestController
@RequestMapping("/user")
@Api(tags = "用户管理",description = "用户管理")
public class UserController {

    @Resource
    private UserServiceImpl userService;

    @GetMapping("/list")
    @ApiOperation(value = "用户列表")
    public ApiResponse<List<UserPO>> list() {
        return ApiResponse.success(userService.list());
    }


    @GetMapping("/page")
    @ApiOperation(value = "用户列表-分页")
    public ApiResponse<Page<UserPO>> page(@RequestParam (defaultValue = "1")long current,@RequestParam(defaultValue = "5") long limit) {
        Page<UserPO> userPOPage = userService.page(current,limit);
        return ApiResponse.success(userPOPage);
    }

    @PostMapping("/add")
    @ApiOperation(value = "添加用户")
    public ApiResponse<UserPO> add(@RequestBody UserPO userPO) {
        userService.save(userPO);
        return ApiResponse.success(userPO);
    }

    @PutMapping("/update")
    @ApiOperation(value = "更新用户")
    public ApiResponse<UserPO> update(@RequestBody UserPO userPO) {
        userService.updateById(userPO);
        return ApiResponse.success(userPO);
    }

    @DeleteMapping("/delete")
    @ApiOperation(value = "删除用户")
    public ApiResponse<UserPO> delete(@RequestParam long userId) {
        userService.removeById(userId);
        return ApiResponse.success(userService.getById(userId));
    }

}
