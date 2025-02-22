package com.iot.cloud.common;

import com.iot.cloud.enums.ApiCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @ClassName ApiResponse
 * @Description TODO 统一的返回类
 * @Author 沈金勇
 * @Email 438217638@qq.com
 * @Date 2025/2/22 21:28
 */
@Data
@Accessors(chain = true)
@Builder
@ApiModel("统一的返回类")
public class ApiResponse<T> implements Serializable {

    private static final long serialVersionUID = -1L;

    @ApiModelProperty("状态码")
    private int code;

    @ApiModelProperty("返回消息")
    private String message;

    @ApiModelProperty("返回数据")
    private T data;

    // 静态方法：成功返回 无数据
    public static <T> ApiResponse<T> success() {
        return new ApiResponse<>(ApiCode.SUCCESS.getCode(), ApiCode.SUCCESS.getMessage(), null);
    }

    // 静态方法：成功返回
    public static <T> ApiResponse<T> success(T data) {
        return new ApiResponse<>(ApiCode.SUCCESS.getCode(), ApiCode.SUCCESS.getMessage(), data);
    }

    // 静态方法：失败返回
    public static <T> ApiResponse<T> error(ApiCode apiCode) {
        return new ApiResponse<>(apiCode.getCode(), apiCode.getMessage(), null);
    }

    // 静态方法：自定义失败返回
    public static <T> ApiResponse<T> error(int code, String message) {
        return new ApiResponse<>(code, message, null);
    }

}
