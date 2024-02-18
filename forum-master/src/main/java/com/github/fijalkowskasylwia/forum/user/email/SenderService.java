package com.github.fijalkowskasylwia.forum.user.email;

import com.github.fijalkowskasylwia.forum.exception.ForumException;

public interface SenderService {

    void sendEmail(EmailMessage emailMessage) throws ForumException;

}
