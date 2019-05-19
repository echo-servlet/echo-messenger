package com.example.gfilangeri.github.echoservlet.repositories;

import com.example.gfilangeri.github.echoservlet.entities.Chat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ChatRepository extends JpaRepository<Chat, Long> {
}
