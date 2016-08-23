package com.javadrop;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;

public class HelloDropwizardConfiguration extends Configuration {
    @NotEmpty
    private String template;
    @NotEmpty
    private String defaultlname;
    @NotEmpty
    private String defaultfname;


    @NotEmpty
    private String defaultName = "Ak";
    @NotEmpty
    private String fnametemp;
    @NotEmpty
    private String lnametemp;

    @JsonProperty
    public String getTemplate() {
        return template;
    }

    @JsonProperty
    public void setTemplate(String template) {
        this.template = template;
    }

    @JsonProperty
    public String getDefaultfname() {
        return defaultfname;
    }

    @JsonProperty
    public void setDefaultfname(String name) {
        this.defaultfname = name;
    }

    @JsonProperty
    public String getDefaultlname() {
        return defaultlname;
    }

    @JsonProperty
    public void setDefaultlname(String name) {
        this.defaultlname = name;
    }

    @JsonProperty
    public String getDefaultName() {
        return defaultName;
    }

    @JsonProperty
    public void setDefaultName(String name) {
        this.defaultName = name;
    }

    @JsonProperty
    public String getFnametemp() {
        return fnametemp;
    }
    @JsonProperty
    public void setFnametemp(String fnametemp) {
        this.fnametemp = fnametemp;
    }

    @JsonProperty
    public void setLnametemp(String lnametemp) {
        this.lnametemp = lnametemp;
    }

    @JsonProperty
    public String getLnametemp() {
        return lnametemp;
    }
}
