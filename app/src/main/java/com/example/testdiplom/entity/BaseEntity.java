package com.example.testdiplom.entity;


import com.fasterxml.jackson.annotation.JsonInclude;


public class BaseEntity {

    @JsonInclude
    public String oid;

    public BaseEntity(String oid) {
        this.oid = oid;
    }

    public BaseEntity() {
        this.oid = oid;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }
}
