package com.github.fijalkowskasylwia.forum.post;

import com.github.fijalkowskasylwia.forum.topic.Topic;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.dawidstankiewicz.forum.user.User;


public interface PostRepository extends JpaRepository<Post, Integer> {
    
    Set<Post> findByUser(User user);
    
    Set<Post> findByTopic(Topic topic);
    
    Set<Post> findAllByOrderByCreationDateDesc();
    
    Set<Post> findTop5ByOrderByCreationDateDesc();
}
