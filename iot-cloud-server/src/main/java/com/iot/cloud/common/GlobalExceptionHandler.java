package com.iot.cloud.common;

import com.iot.cloud.enums.ApiCode;
import io.swagger.annotations.ApiModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.NoHandlerFoundException;

/**
 * @ClassName GlobalExceptionHandler
 * @Description TODO 全局异常处理器
 * @Author 沈金勇
 * @Email 438217638@qq.com
 * @Date 2025/2/22 21:59
 */
@RestControllerAdvice
@ApiModel("全局异常处理器")
public class GlobalExceptionHandler {

    // 处理所有异常 500 服务器内部错误
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ApiResponse<String> handleException(Exception e) {
        return ApiResponse.error(ApiCode.INTERNAL_SERVER_ERROR);
    }

    // 400 缺少请求参数
    @ExceptionHandler(MissingServletRequestParameterException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    private ApiResponse<String> missingServletRequestParameter(Exception exception) {
        return ApiResponse.error(ApiCode.BAD_REQUEST);
    }

    // 400 请求参数格式有误
    @ExceptionHandler({MethodArgumentTypeMismatchException.class, HttpMessageNotReadableException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    private ApiResponse<String> typeMismatch(Exception exception) {
        return ApiResponse.error(ApiCode.BAD_REQUEST);
    }

    // 404 资源未找到
    @ExceptionHandler(NoHandlerFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ApiResponse<String> handlerNoFoundException(Exception exception) {
        return ApiResponse.error(ApiCode.NOT_FOUND);
    }

    // 405 请求的HTTP方法不支持
    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    @ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
    private ApiResponse<String> httpRequestMethodNotSupported(Exception exception) {
        return ApiResponse.error(ApiCode.METHOD_NOT_ALLOWED);
    }

    // 处理自定义异常
    @ExceptionHandler(CustomException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiResponse<String> handleCustomException(CustomException exception) {
        return ApiResponse.error(ApiCode.BAD_REQUEST);
    }

}
