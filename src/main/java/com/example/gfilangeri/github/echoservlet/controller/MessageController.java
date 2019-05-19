package com.example.gfilangeri.github.echoservlet.controller;

import com.example.gfilangeri.github.echoservlet.entities.Message;
import com.example.gfilangeri.github.echoservlet.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping(value = "/")
    public String index() {
        return "index";
    }

    @GetMapping(value = "/messages/{chatId}")
    @CrossOrigin
    public List<Message> messages(@PathVariable("chatId") long chatId) {
        List<Message> messages = messageService.getAllMessagesWithChatId(chatId);
        System.out.println("messages: " + messages);
        return messages;
    }

    @PostMapping(value = "/message")
    @CrossOrigin
    public Message publishMessage(@RequestBody Message message) {
        if (message.getDate() == null) {
            message.setDate(new Date());
        }
        messageService.insert(message);
        return message;
    }
}
