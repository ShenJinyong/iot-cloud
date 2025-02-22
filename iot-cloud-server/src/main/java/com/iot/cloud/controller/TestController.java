package com.iot.cloud.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName TestController
 * @Description TODO 测试管理
 * @Author 沈金勇
 * @Email 438217638@qq.com
 * @Date 2025/2/22 20:10
 */
@RestController
@RequestMapping("/test")
@Api(tags = "测试管理",description = "用户测试Knife4j和Swagger的简单接口")
public class TestController {

    @GetMapping("/hello")
    @ApiOperation(value = "简单的问候", notes = "返回一个简单的问候消息")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello from IoT Device Service!");
    }

}
