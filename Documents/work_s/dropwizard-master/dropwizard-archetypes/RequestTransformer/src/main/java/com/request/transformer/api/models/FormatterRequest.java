package com.request.transformer.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by akila on 8/23/16.
 */
public class FormatterRequest {
    private String key;
    private String keyFormat;
    private String valueFomat;

    public FormatterRequest(String key, String keyFormat, String valueFomat){
        super();
        this.key = key;
        this.keyFormat = keyFormat;
        this.valueFomat = valueFomat;
    }
    @JsonProperty
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
    @JsonProperty
    public String getKeyFormat() {
        return keyFormat;
    }

    public void setKeyFormat(String keyFormat) {
        this.keyFormat = keyFormat;
    }
    @JsonProperty
    public String getValueFomat() {
        return valueFomat;
    }

    public void setValueFomat(String valueFomat) {
        this.valueFomat = valueFomat;
    }
}
