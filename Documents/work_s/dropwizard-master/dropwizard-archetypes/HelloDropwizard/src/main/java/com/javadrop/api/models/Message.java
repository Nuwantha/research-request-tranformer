package com.javadrop.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by akila on 8/19/16.
 */

public class Message {
    private long id;
    private String msg;
    private Date created;
    public Message(int id, String msg){
        this.msg = msg;
        this.id = id;
        this.created = new Date();
    }
    @JsonProperty
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    @JsonProperty
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    @JsonProperty
    public Date getCreated() {
        return created;
    }
}
