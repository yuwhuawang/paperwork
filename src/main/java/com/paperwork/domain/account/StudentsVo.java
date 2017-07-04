package com.paperwork.domain.account;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by yuwhuawang on 17/7/4.
 */

@Document(collection = "account")
public class StudentsVo {
    @Id
    public String id;
    public String username;
    public String class_name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public StudentsVo() {
    }

    public StudentsVo(String username, String class_name) {
        this.username = username;
        this.class_name = class_name;
    }

    @Override
    public String toString() {
        return "StudentsVo{" +
                "username='" + username + '\'' +
                ", class_name='" + class_name + '\'' +
                '}';
    }
}
