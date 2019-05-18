package com.example.gfilangeri.github.echoservlet.service;

import com.example.gfilangeri.github.echoservlet.entities.Message;
import com.example.gfilangeri.github.echoservlet.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public List<Message> getAllMessages() {
        return messageRepository.findAll();
    }

    public void insert(Message message) {
        messageRepository.save(message);
    }
}