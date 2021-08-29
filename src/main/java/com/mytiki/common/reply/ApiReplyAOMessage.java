/*
 * Copyright (c) TIKI Inc.
 * MIT license. See LICENSE file in root directory.
 */

package com.mytiki.common.reply;

import java.util.HashMap;

public class ApiReplyAOMessage {

    private Integer code;
    private String status;
    private String message;
    private HashMap<String, String> properties;

    public ApiReplyAOMessage() {}

    public ApiReplyAOMessage(String message) {
        this.message = message;
    }

    public ApiReplyAOMessage(String message, HashMap<String, String> properties) {
        this.message = message;
        this.properties = properties;
    }

    public ApiReplyAOMessage(Integer code, String status, String message, HashMap<String, String> properties) {
        this.code = code;
        this.status = status;
        this.message = message;
        this.properties = properties;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HashMap<String, String> getProperties() {
        return properties;
    }

    public void setProperties(HashMap<String, String> properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "ApiReplyAOMessage{" +
                "code=" + code +
                ", status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", properties=" + properties +
                '}';
    }
}
