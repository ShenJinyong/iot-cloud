package com.iot.cloud.pojo.po;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ClassName UserPO
 * @Description TODO 系统用户
 * @Author 沈金勇
 * @Email 438217638@qq.com
 * @Date 2025/2/23 15:12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("系统用户")
@TableName("sys_user")
public class UserPO {

    @TableId(value = "user_id")
    @ApiModelProperty("用户ID")
    private Long userId;

    @ApiModelProperty("用户账号")
    private String userName;

    @ApiModelProperty("用户昵称")
    private String nickName;

    @ApiModelProperty("用户邮箱")
    private String email;

    @ApiModelProperty("手机号码")
    private String phoneNumber;

    @ApiModelProperty("用户性别")
    private String sex;

    @ApiModelProperty(" 用户头像")
    private String avatar;

    @ApiModelProperty(" 用户密码")
    private String password;

    @ApiModelProperty("帐号状态（0正常 1停用）")
    private String status;

    @ApiModelProperty("删除标志（0代表存在 1代表删除）")
    private String delFlag;

    @ApiModelProperty("创建者")
    private Long createBy;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新者")
    private Long updateBy;

    @ApiModelProperty("更新时间")
    private Date updateTime;

}