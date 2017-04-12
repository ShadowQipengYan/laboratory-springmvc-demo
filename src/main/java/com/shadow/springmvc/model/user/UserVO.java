package com.shadow.springmvc.model.user;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Spring 对 Java validation API支持
 *
 * Created by shadow on 17/4/12.
 */
public class UserVO {

    @NotNull
    @Size(min = 3, max = 18)
    private String userName;

    @NotNull
    @Size(min = 6, max = 18)
    private String pwd;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
