package com.javadrop.services;

import com.javadrop.api.models.Message;

import javax.ws.rs.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by akila on 8/19/16.
 */
public class MessageService {
    private HashMap<Long,Message> msgHash;

    public MessageService(){
        this.msgHash = new HashMap<Long, Message>();
        Message msg1 = new Message(5,"Akila Hello!");
        Message msg2 = new Message(6,"Alpa Hello!");
        this.msgHash.put(msg1.getId(), msg1);
        this.msgHash.put(msg2.getId(), msg2);

    }
    public List<Message> getMsgList(){
        ArrayList<Message> msglist = new ArrayList<Message>(this.msgHash.values());

        return msglist;
    }
    public Message getMessage(long id){
        return (Message) this.msgHash.get(id);
    }
    public  void createMessage(Message message){
        this.msgHash.put(message.getId(),message);
    }

}
