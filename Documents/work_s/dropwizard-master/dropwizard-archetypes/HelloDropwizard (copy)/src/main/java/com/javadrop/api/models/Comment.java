package com.javadrop.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * Created by akila on 8/19/16.
 */
public class Comment {
    private String author;
    private long id;
    private String comment;
    private Date created;

    public Comment(long id, String author, String comment){
        this.author = (author);
        this.comment=(comment);
        this.id=(id);
        this.created=(new Date());
    }

    @JsonProperty
    public String getAuthor() {
        return author;
    }
    @JsonProperty
    public long getId() {
        return id;
    }
    @JsonProperty
    public String getComment() {
        return comment;
    }

    @JsonProperty
    public Date getCreated() {
        return created;
    }
}
