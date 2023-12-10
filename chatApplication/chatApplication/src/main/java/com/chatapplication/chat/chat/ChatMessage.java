package com.chatapplication.chat.chat;

import lombok.*;
import org.apache.logging.log4j.message.Message;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMessage {
    private String content;
    private String sender;
    private MessageType type;
}
