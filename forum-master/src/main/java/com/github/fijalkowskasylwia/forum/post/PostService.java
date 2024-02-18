package com.github.fijalkowskasylwia.forum.post;

import com.github.fijalkowskasylwia.forum.topic.Topic;
import com.github.fijalkowskasylwia.forum.user.User;
import java.util.List;
import java.util.Set;

import com.github.fijalkowskasylwia.forum.post.Post;


public interface PostService {
    
    Post findOne(int id);
    
    List<Post> findAll();
    
    Set<Post> findRecent();
    
    Set<Post> findAllByOrderByCreationDateDesc();
    
    Set<Post> findByUser(User user);
    
    Set<Post> findByTopic(int idTopic);
    
    Set<Post> findByTopic(Topic topic);
    
    void save(Post post);
    
    void delete(int id);
    
    void delete(Post post);
    
    void save(String content,
              String username,
              int idTopic);
    
}
