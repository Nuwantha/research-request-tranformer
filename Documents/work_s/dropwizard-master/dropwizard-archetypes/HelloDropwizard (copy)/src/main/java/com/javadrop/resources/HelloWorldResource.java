package com.javadrop.resources;

//import com.codahale.metrics.*;
import com.codahale.metrics.annotation.*;
import com.javadrop.api.Saying;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.atomic.AtomicLong;
import java.util.Optional;

/**
 * Created by akila on 8/12/16.
 */
@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldResource {
    private final String template;
    private final String fnametemp;
    private final String lnametemp;
    private final String defaultName,defaultlname,defaultfname;
    private final AtomicLong counter;

    public HelloWorldResource(String template, String fnametemp, String lnametemp, String defaultName,
                              String defaultfname, String defaultlname) {
        this.template = template;
        this.fnametemp = fnametemp;
        this.lnametemp = lnametemp;
        this.defaultName = defaultName;
        this.defaultfname =defaultfname;
        this.defaultlname = defaultlname;
        this.counter = new AtomicLong();
    }

    @GET
    @Timed
    public Saying sayHello(@QueryParam("username") Optional<String> name,
                           @QueryParam("fname") Optional<String> fname, @QueryParam("lname") Optional<String> lname) {
        final String value = String.format(template, name.orElse(defaultName));
        final String fName = String.format(fnametemp, fname.orElse(defaultfname));
        final String lName = String.format(lnametemp, lname.orElse(defaultlname));
        return new Saying(counter.incrementAndGet(), value, fName, lName);

    }
}