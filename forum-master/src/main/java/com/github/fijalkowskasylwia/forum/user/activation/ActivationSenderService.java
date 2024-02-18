package com.github.fijalkowskasylwia.forum.user.activation;

import com.github.fijalkowskasylwia.forum.user.User;

public interface ActivationSenderService {

    void sendActivationCode(User user);

}
