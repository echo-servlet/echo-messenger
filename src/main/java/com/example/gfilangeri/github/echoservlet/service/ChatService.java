package com.example.gfilangeri.github.echoservlet.service;

import com.example.gfilangeri.github.echoservlet.entities.Chat;
import com.example.gfilangeri.github.echoservlet.repositories.ChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatService {
    @Autowired
    private ChatRepository chatRepository;

    public List<Chat> getAllChats() {
        return chatRepository.findAll();
    }

    public void insert(Chat chat) {
        chatRepository.save(chat);
    }
}
