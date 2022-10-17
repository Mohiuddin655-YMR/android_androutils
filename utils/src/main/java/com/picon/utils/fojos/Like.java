package com.picon.utils.fojos;

import java.io.Serializable;

public class Like implements Serializable {

    private long time_mills;

    private String document_id;

    private String user_id;

    public Like() {
        this.time_mills = System.currentTimeMillis();
    }

    public Like(String document_id, String user_id) {
        this();
        this.document_id = document_id;
        this.user_id = user_id;
    }

    public long getTime_mills() {
        return time_mills;
    }

    public Like setTime_mills(long time_mills) {
        this.time_mills = time_mills;
        return this;
    }

    public String getDocument_id() {
        return document_id;
    }

    public Like setDocument_id(String document_id) {
        this.document_id = document_id;
        return this;
    }

    public String getUser_id() {
        return user_id;
    }

    public Like setUser_id(String user_id) {
        this.user_id = user_id;
        return this;
    }

}
