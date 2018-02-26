package com.gzs.webdemotemp.dto;

/**
 * @Desp
 * @Date 2018/1/31
 * @Author mtty
 */
public class ResponseData {

    public static final transient String CODE_SUCCESS = "000";
    public static final transient String CODE_ERROR = "999";
    public static final transient String CODE_EXCEPTION = "555";

    private String code;
    private String msg;
    private Object data;


    public static ResponseData success(Object data){
        ResponseData responseData = new ResponseData();
        responseData.setCode(CODE_SUCCESS);
        responseData.setMsg("success");
        responseData.setData(data);
        return responseData;
    }
    public static ResponseData error(String errMsg){
        ResponseData responseData = new ResponseData();
        responseData.setCode(CODE_ERROR);
        responseData.setMsg(errMsg);
        return responseData;
    }
    public static ResponseData exception(String errMsg){
        ResponseData responseData = new ResponseData();
        responseData.setCode(CODE_EXCEPTION);
        responseData.setMsg(errMsg);
        return responseData;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
