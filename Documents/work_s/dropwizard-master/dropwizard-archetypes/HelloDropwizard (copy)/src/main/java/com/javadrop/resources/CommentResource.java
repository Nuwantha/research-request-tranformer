package com.javadrop.resources;

import com.javadrop.api.models.Comment;
import com.javadrop.services.CommentService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by akila on 8/19/16.
 */
@Path("/")
public class CommentResource {
    private CommentService commentService = new CommentService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Comment> getAllComments(){
        return commentService.getCommentsList();
    }
    @GET
    @Path("/{commentId}")
    @Produces(MediaType.APPLICATION_JSON)
    //@Produces(MediaType.APPLICATION_JSON)
    public Comment getComment(@PathParam("commentId") long commentId){
        return commentService.getComment(commentId);
    }
}
