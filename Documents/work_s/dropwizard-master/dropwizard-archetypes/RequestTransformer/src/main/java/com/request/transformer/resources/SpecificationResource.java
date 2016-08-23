package com.request.transformer.resources;

/**
 * Created by akila on 8/23/16.
 */

import com.request.transformer.api.models.FormatterRequest;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

@Path("/specification")
public class SpecificationResource {

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public FormatterRequest createSpecification(FormatterRequest formatterRequest){
        return formatterRequest;
    }
   /* @GET
    @Consumes(MediaType.APPLICATION_JSON)
    public String createSpecification(FormatterRequest formatterRequest){
        return "Done";
    }*/


}
