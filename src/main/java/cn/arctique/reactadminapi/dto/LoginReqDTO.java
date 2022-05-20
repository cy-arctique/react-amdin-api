package cn.arctique.reactadminapi.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author arctique
 * @date 2021/12/5 00:00:08
 */
@Setter
@Getter
@ToString
@Accessors(chain = true)
public class LoginReqDTO implements Serializable {

    private static final long serialVersionUID = 629997947087997354L;

    /**
     * 账号
     */
    private String username;

    /**
     * 密码
     */
    private String password;
}
