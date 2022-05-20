package cn.arctique.reactadminapi.util;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author arctique
 * @date 2021/3/12 17:05
 **/
@Setter
@Getter
@ToString
public class Result<T> implements Serializable {

    private static final long serialVersionUID = -8067964807361486742L;

    private Integer code;

    private String msg;

    private T data;

    public static <T> Result<T> success() {
        return result(Constant.SUCCESS, null, null);
    }

    public static <T> Result<T> success(String msg) {
        return result(Constant.SUCCESS, msg, null);
    }

    public static <T> Result<T> success(String msg, T data) {
        return result(Constant.SUCCESS, msg, data);
    }

    public static <T> Result<T> failure() {
        return result(Constant.FAILED, null, null);
    }

    public static <T> Result<T> failure(String msg) {
        return result(Constant.FAILED, msg, null);
    }

    public static <T> Result<T> failure(String msg, T data) {
        return result(Constant.FAILED, msg, data);
    }

    private static <T> Result<T> result(Integer code, String msg, T data) {
        Result<T> result = new Result<>();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }
}
