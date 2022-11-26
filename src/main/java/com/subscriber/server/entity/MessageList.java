package com.subscriber.server.entity;

import java.util.List;

public class MessageList {
    private List<Message> messageList;

    public MessageList() {
    }

    public MessageList(List<Message> messageList) {
        this.messageList = messageList;
    }

    public List<Message> getMessageList() {
        return messageList;
    }

    public void setMessageList(List<Message> messageList) {
        this.messageList = messageList;
    }

    @Override
    public String toString() {
        return "MessageList{" +
                "messageList=" + messageList +
                '}';
    }
}
