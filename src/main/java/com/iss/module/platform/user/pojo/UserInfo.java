package com.iss.module.platform.user.pojo;

public class UserInfo extends User {


    private Integer active;

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }
}
