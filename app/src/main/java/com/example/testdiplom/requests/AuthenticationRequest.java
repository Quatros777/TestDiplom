package com.example.testdiplom.requests;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonInclude;

public class AuthenticationRequest {

    @JsonInclude
    @JsonAlias({"login"})
    public String name;

    @JsonInclude
    public String password;

    public AuthenticationRequest(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
