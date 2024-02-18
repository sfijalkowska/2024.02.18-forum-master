package com.github.fijalkowskasylwia.forum.section;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.fijalkowskasylwia.forum.section.Section;


public interface SectionRepository extends JpaRepository<Section, Integer> {
    
    Section findByName(String name);
    
}
