package com.picon.utils.fojos;

import java.io.Serializable;

public class Report implements Serializable {

    private long time_mills;

    private boolean verified;

    private String document_id;

    private String publisher_id;

    private String report_text;
    private Type report_type;

    private String reporter_id;
    private String reporter_name;
    private String reporter_title;
    private String reporter_avatar;

    public Report create(String document_id, String publisher_id, String report_text, Type report_type, String reporter_id, String reporter_name, String reporter_title, String reporter_avatar) {
        this.time_mills = System.currentTimeMillis();
        this.verified = false;
        this.document_id = document_id;
        this.publisher_id = publisher_id;
        this.report_text = report_text;
        this.report_type = report_type;
        this.reporter_id = reporter_id;
        this.reporter_name = reporter_name;
        this.reporter_title = reporter_title;
        this.reporter_avatar = reporter_avatar;
        return this;
    }

    public Report build(long time_mills, boolean verified, String document_id, String publisher_id, String report_text, Type report_type, String reporter_id, String reporter_name, String reporter_title, String reporter_avatar) {
        this.time_mills = time_mills;
        this.verified = verified;
        this.document_id = document_id;
        this.publisher_id = publisher_id;
        this.report_text = report_text;
        this.report_type = report_type;
        this.reporter_id = reporter_id;
        this.reporter_name = reporter_name;
        this.reporter_title = reporter_title;
        this.reporter_avatar = reporter_avatar;
        return this;
    }

    public long getTime_mills() {
        return time_mills;
    }

    public Report setTime_mills(long time_mills) {
        this.time_mills = time_mills;
        return this;
    }

    public boolean isVerified() {
        return verified;
    }

    public Report setVerified(boolean verified) {
        this.verified = verified;
        return this;
    }

    public String getDocument_id() {
        return document_id;
    }

    public Report setDocument_id(String document_id) {
        this.document_id = document_id;
        return this;
    }

    public String getPublisher_id() {
        return publisher_id;
    }

    public Report setPublisher_id(String publisher_id) {
        this.publisher_id = publisher_id;
        return this;
    }

    public String getReport_text() {
        return report_text;
    }

    public Report setReport_text(String report_text) {
        this.report_text = report_text;
        return this;
    }

    public Type getReport_type() {
        return report_type != null ? report_type : Type.NONE;
    }

    public Report setReport_type(Type report_type) {
        this.report_type = report_type;
        return this;
    }

    public String getReporter_id() {
        return reporter_id;
    }

    public Report setReporter_id(String reporter_id) {
        this.reporter_id = reporter_id;
        return this;
    }

    public String getReporter_name() {
        return reporter_name;
    }

    public Report setReporter_name(String reporter_name) {
        this.reporter_name = reporter_name;
        return this;
    }

    public String getReporter_title() {
        return reporter_title;
    }

    public Report setReporter_title(String reporter_title) {
        this.reporter_title = reporter_title;
        return this;
    }

    public String getReporter_avatar() {
        return reporter_avatar;
    }

    public Report setReporter_avatar(String reporter_avatar) {
        this.reporter_avatar = reporter_avatar;
        return this;
    }

    public enum Type implements Serializable {
        NONE, BLACKMAIL, COPY_RIGHT, INAPPROPRIATE, PERSONAL;
        public static final String blackmail = "Blackmail";
        public static final String copy_right = "Copy Right";
        public static final String inappropriate = "Inappropriate";
        public static final String personal = "Personal";
    }

}
