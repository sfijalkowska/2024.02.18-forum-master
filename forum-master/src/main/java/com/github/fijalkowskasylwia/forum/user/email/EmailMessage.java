package com.github.fijalkowskasylwia.forum.user.email;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class EmailMessage {

    private String recipient;
    private String subject;
    private String content;
}
