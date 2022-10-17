package com.picon.utils.fojos;

import java.io.Serializable;

public class Viewer implements Serializable {

    private long time_mills;

    private String document_id;

    private String viewer_id;

    public Viewer() {
        this.time_mills = System.currentTimeMillis();
    }

    public Viewer(String document_id, String viewer_id) {
        this();
        this.document_id = document_id;
        this.viewer_id = viewer_id;
    }

    public long getTime_mills() {
        return time_mills;
    }

    public Viewer setTime_mills(long time_mills) {
        this.time_mills = time_mills;
        return this;
    }

    public String getDocument_id() {
        return document_id;
    }

    public Viewer setDocument_id(String document_id) {
        this.document_id = document_id;
        return this;
    }

    public String getViewer_id() {
        return viewer_id;
    }

    public Viewer setViewer_id(String viewer_id) {
        this.viewer_id = viewer_id;
        return this;
    }

}
