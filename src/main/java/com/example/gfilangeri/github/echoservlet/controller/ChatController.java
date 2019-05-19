package com.example.gfilangeri.github.echoservlet.controller;

import com.example.gfilangeri.github.echoservlet.entities.Chat;
import com.example.gfilangeri.github.echoservlet.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ChatController {
    @Autowired
    private ChatService chatService;

    @GetMapping(value = "/chat")
    @CrossOrigin
    public List<Chat> chats() {
        List<Chat> messages = chatService.getAllChats();
        return messages;
    }

    @PostMapping(value = "/chat")
    @CrossOrigin
    public Chat publishChat(@RequestBody Chat chat) {
        System.out.println("group "+ chat.getGroupId());
        System.out.println("title "+ chat.getTitle());
        chatService.insert(chat);
        return chat;
    }
}
