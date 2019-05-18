package com.example.gfilangeri.github.echoservlet.repositories;

import com.example.gfilangeri.github.echoservlet.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {

}
