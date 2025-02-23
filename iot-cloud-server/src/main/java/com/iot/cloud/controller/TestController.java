package com.iot.cloud.controller;

import com.iot.cloud.common.ApiResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    @ApiOperation(value = "简单的问候", notes = "返回问候消息")
    public ApiResponse<String> sayHello() {
        return ApiResponse.success("Hello from IoT Device Service!");
    }

    @GetMapping("/error")
    @ApiOperation(value = "请求参数测试", notes = "返回异常")
    public ApiResponse<Integer> getError(@RequestParam int number) {
        int i = 1 / 0;
        return ApiResponse.success(number);
    }

    @GetMapping("/custom-error")
    @ApiOperation(value = "业务异常测试", notes = "返回业务异常")
    public ApiResponse<String> getCustomError() {
        return ApiResponse.error(999, "业务异常");
    }

}
