package com.javadrop.services;

import com.javadrop.api.models.Comment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by akila on 8/19/16.
 */
public class CommentService {
    private HashMap<Long,Comment> commentHashMap;

    public CommentService(){
        this.commentHashMap = new HashMap<Long, Comment>();
        Comment cmt1 = new Comment(1,"Akila","My name is Akila");
        Comment cmt2 = new Comment(2,"Someone","My name is null");
        this.commentHashMap.put(cmt1.getId(),cmt1);
        this.commentHashMap.put(cmt2.getId(),cmt2);
    }
    public List<Comment> getCommentsList(){
        return new ArrayList<Comment>(this.commentHashMap.values());
    }
    public Comment getComment(long id){
        return (Comment) commentHashMap.get(id);
    }
}
