package com.dto.user;

public class SignInDto {

    private String email;
    private String password;

    public SignInDto(String email, String password){

    }

    public String getEmail()
    {
        return email;
    }
    public void setemail(String email)
    {
        this.email = email;
    }

    public String getpassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }

}
