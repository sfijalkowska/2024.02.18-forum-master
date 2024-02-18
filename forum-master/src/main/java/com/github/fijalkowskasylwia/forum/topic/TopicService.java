package com.github.fijalkowskasylwia.forum.topic;

import com.github.fijalkowskasylwia.forum.user.User;
import java.util.List;
import java.util.Set;

import com.github.fijalkowskasylwia.forum.section.Section;


public interface TopicService {
    
    List<Topic> findAll();
    
    Topic findOne(int id);
    
    Set<Topic> findRecent();
    
    Set<Topic> findAllByOrderByCreationDateDesc();
    
    Set<Topic> findBySection(Section section);
    
    Set<Topic> findBySection(String sectionName);
    
    Topic save(Topic topic);
    
    Set<Topic> findBySection(int id);
    
    Set<Topic> findByUser(User user);
    
    void delete(int id);
    
    void delete(Topic topic);
    
}
