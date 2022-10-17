package com.picon.utils.fojos;

import java.io.Serializable;

public class Follow implements Serializable {

    private boolean active;

    private long time_mills;
    private String current_id;
    private String none_id;

    public Follow() {
        this.active = true;
        this.time_mills = System.currentTimeMillis();
    }

    public Follow(String current_id, String none_id) {
        this();
        this.current_id = current_id;
        this.none_id = none_id;
    }

    public boolean isActive() {
        return active;
    }

    public Follow setActive(boolean active) {
        this.active = active;
        return this;
    }

    public long getTime_mills() {
        return time_mills;
    }

    public Follow setTime_mills(long time_mills) {
        this.time_mills = time_mills;
        return this;
    }

    public String getCurrent_id() {
        return current_id;
    }

    public Follow setCurrent_id(String current_id) {
        this.current_id = current_id;
        return this;
    }

    public String getNone_id() {
        return none_id;
    }

    public Follow setNone_id(String none_id) {
        this.none_id = none_id;
        return this;
    }
}
