package com.javadrop.resources;

import com.javadrop.api.models.Comment;
import com.javadrop.api.models.Message;
import com.javadrop.services.MessageService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by akila on 8/19/16.
 */
@Path("/messages")

public class MessageResource {
    private MessageService messageService = new MessageService();
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Message> getMessages(){
        return this.messageService.getMsgList();
        //return "hello";
    }
    @GET
    @Path("/{messageId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Message getMessage(@PathParam("messageId") long messageId){
        return this.messageService.getMessage(messageId);
    }
    @Path("/{messageId}/comments")
    public CommentResource lookComments(){
        return new CommentResource();
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Message createMessage(Message msg){
       //messageService.createMessage(msg);
       //return this.messageService.getMessage(6);
        //return "hello";
        return msg;
    }
}
