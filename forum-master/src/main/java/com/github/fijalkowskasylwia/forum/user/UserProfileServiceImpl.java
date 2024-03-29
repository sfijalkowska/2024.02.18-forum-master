package com.github.fijalkowskasylwia.forum.user;

import com.github.fijalkowskasylwia.forum.user.UserProfile;
import com.github.fijalkowskasylwia.forum.user.User;
import com.github.fijalkowskasylwia.forum.post.PostService;
import com.github.fijalkowskasylwia.forum.topic.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.fijalkowskasylwia.forum.user.UserService;
import com.github.fijalkowskasylwia.forum.user.UserProfileService;


@Service
public class UserProfileServiceImpl implements UserProfileService {
    
    @Autowired
    private UserService userService;
    
    @Autowired
    private PostService postService;
    
    @Autowired
    private TopicService topicService;
    
    @Override
    public UserProfile findOne(int userId) {
        UserProfile userProfile = new UserProfile();
        User user = userService.findOne(userId);
        userProfile.setUser(user);
        userProfile.setPosts(postService.findByUser(user));
        userProfile.setTopics(topicService.findByUser(user));
        return userProfile;
    }
    
    @Override
    public UserProfile findOne(String username) {
        return findOne(userService.findByUsername(username).getId());
    }
    
}
