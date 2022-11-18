package cn.seem.springboottemplate.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * 统一返回值类型
 */
public class Result implements Constant {
    private Boolean success;

    private Integer code;

    private String message;

    private Map<String, Object> data = new HashMap<String, Object>();

    private Result() {

    }

    public static Result ok() {
        Result r = new Result();
        r.setSuccess(true);
        r.setCode(Constant.SUCCESS); //0
        r.setMessage("成功");
        return r;
    }

    public static Result error() {
        Result r = new Result();
        r.setSuccess(true);
        r.setCode(Constant.ERROR); //1
        r.setMessage("失败");
        return r;
    }


    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
    public void setData(String key,Object value) {
        this.data.put(key, value);
    }
}
