package org.launchcode.codingevents.models.dto;

import com.mysql.cj.log.Log;

public class RegisterFormDTO extends LoginFormDTO {
    private String verifyPassword;

    public RegisterFormDTO(String verifyPassword) {
        this.verifyPassword = verifyPassword;
    }

    public RegisterFormDTO(){}

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
    }
}
