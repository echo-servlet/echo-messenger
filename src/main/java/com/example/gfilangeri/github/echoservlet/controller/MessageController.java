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

    @GetMapping(value = "/messages")
    @CrossOrigin
    public String messages() {
        List<Message> messages = messageService.getAllMessages();
        return "messages are here";
    }

    @PostMapping(value = "/message")
    @CrossOrigin
    public void publishMessage(@RequestBody Message message) {
        if (message.getDate() == null) {
            message.setDate(new Date());
        }
        messageService.insert(message);
    }
}
