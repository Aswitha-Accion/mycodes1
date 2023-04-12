package com.dto.user;

public class ResponseDto {

    private String status;

    private String response;

    public ResponseDto(String status,String response){

    }
    public String getstatus(){
        return status;
    }
    public void setStatus(){
        this.status = status;
    }

    public String getResponse(){
        return response;
    }
    public void setResponse(){
        this.status = status;
    }
}
