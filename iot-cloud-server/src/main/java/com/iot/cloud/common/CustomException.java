package com.iot.cloud.common;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * @ClassName CustomException
 * @Description TODO 业务异常
 * @Author 沈金勇
 * @Email 438217638@qq.com
 * @Date 2025/2/22 22:06
 */
@Data
@ApiModel("业务异常")
public class CustomException extends RuntimeException{

    private int code;
    private String message;

}
