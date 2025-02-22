package com.iot.cloud.enums;

import io.swagger.annotations.ApiModel;
import lombok.Getter;

/**
 * @EnumName ApiCode
 * @Description TODO 状态码枚举
 * @Author 沈金勇
 * @Email 438217638@qq.com
 * @Date 2025/2/22 21:33
 */
@ApiModel("状态码枚举")
@Getter
public enum ApiCode {

    SUCCESS(200, "成功"),
    BAD_REQUEST(400, "请求参数错误"),
    UNAUTHORIZED(401, "未授权"),
    FORBIDDEN(403, "禁止访问"),
    NOT_FOUND(404, "资源未找到"),
    METHOD_NOT_ALLOWED(405,"请求的HTTP方法不支持"),
    INTERNAL_SERVER_ERROR(500, "服务器内部错误");

    private final int code;
    private final String message;

    ApiCode(int code,String message){
        this.code = code;
        this.message = message;
    }

}
