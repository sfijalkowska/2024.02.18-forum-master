package com.github.fijalkowskasylwia.forum.user;


public interface UserProfileService {
    
    public UserProfile findOne(int userId);
    
    public UserProfile findOne(String username);
    
}
