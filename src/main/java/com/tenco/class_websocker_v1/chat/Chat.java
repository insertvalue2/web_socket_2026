package com.tenco.class_websocker_v1.chat;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;

@NoArgsConstructor
@Getter
@Table(name = "chat_tb")
@Entity
public class Chat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String msg;

    @Builder
    public Chat(Integer id, String msg) {
        this.id = id;
        this.msg = msg;
    }
}
