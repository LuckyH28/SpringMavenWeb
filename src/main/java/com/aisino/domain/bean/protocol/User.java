package com.aisino.domain.bean.protocol;

import java.io.Serializable;

/**
 * DESCRIPTION：User info
 *
 * @author LuckyH
 * @create 2017-07-10 14:14
 **/
public class User implements Serializable {

    private String username ;

    private String sex;

    private String age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
