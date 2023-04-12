package com.dto.user;

public class SignupDto {

    private String firstname;
    private String lastname;
    private String email;
    private String password;

    public SignupDto(String firstname,String lastname,String email,String password)
    {

    }
    public String getFirstname()
    {
        return firstname;

    }public void setFirstname(String firstname)
    {
        this.firstname = firstname;
    }

    public String getLastname()
    {
        return lastname;
    }
    public void setLastname(String lastname)
    {
        this.lastname = lastname;
    }

    public String getemail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public String getpassword()
    {
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
}
