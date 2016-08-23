package com.javadrop.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;

/**
 * Created by akila on 8/12/16.
 */
public class Saying {
    private long id;


    @Length(max = 3)
    private String userName;
    private String fName;
    private String lName;

    public Saying() {
        // Jackson deserialization
    }

    public Saying(long id, String userName, String fName, String lName) {
        this.id = id;
        this.userName = userName;
        this.fName = fName;
        this.lName = lName;
    }

    @JsonProperty
    public long getId() {
        return id;
    }

    @JsonProperty
    public String getUserName() {
        return userName;
    }

    @JsonProperty
    public String getfName() {
        return fName;
    }

    @JsonProperty
    public String getlName() {
        return lName;
    }

}