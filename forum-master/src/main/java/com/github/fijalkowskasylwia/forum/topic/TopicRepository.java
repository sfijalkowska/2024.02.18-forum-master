package com.github.fijalkowskasylwia.forum.topic;

import com.github.fijalkowskasylwia.forum.section.Section;
import com.github.fijalkowskasylwia.forum.user.User;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;


public interface TopicRepository extends JpaRepository<Topic, Integer> {
    
    Set<Topic> findBySection(Section section);
    
    Set<Topic> findByUser(User user);
    
    Set<Topic> findAllByOrderByCreationDateDesc();
    
    Set<Topic> findTop5ByOrderByCreationDateDesc();
    
    
}
