package com.chichat.app.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Getter
@Setter
public class ChatMessage {
    private Long id;
    private String sender;
    private String content;
}
