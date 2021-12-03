package com.example.emailverificationapicomp1011g;

import com.google.gson.annotations.SerializedName;

public class EmailResponse {

    private String totalResults;

    @SerializedName("Status")
    private String status;

    @SerializedName("Email")
    private String email;

    @SerializedName("Domain")
    private String domain;

    @SerializedName("Error")
    private String error;

    @SerializedName("Message")
    private String message;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String Email) {
        this.email = email;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String Domain) {
        this.domain = domain;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        if(status == "true") {
            return "Email address is valid";
            }
        else if (status == "false"){
            return "Email address is invalid";
         }
        return "No Input";
    }
}