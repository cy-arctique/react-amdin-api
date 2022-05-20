package cn.arctique.reactadminapi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author cy
 * @date 2021-12-08 11:36
 */
@Setter
@Getter
@ToString
@Accessors(chain = true)
@TableName(value = "admin")
@ApiModel(value = "管理员表")
public class Admin implements Serializable {

    private static final long serialVersionUID = -6408522168601397098L;

    @TableId(type = IdType.AUTO)
    @ApiModelProperty(value = "id")
    private Integer id;

    @ApiModelProperty(value = "管理员名称")
    private String name;

    @ApiModelProperty(value = "电话")
    private String mobile;

    @ApiModelProperty(value = "邮箱")
    private String email;
}
