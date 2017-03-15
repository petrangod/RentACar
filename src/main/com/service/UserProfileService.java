package main.com.service;


import main.com.entity.UserProfile;

import java.util.List;

public interface UserProfileService {

    UserProfile findById(int id);
    UserProfile findByType(String type);
    List<UserProfile> findAll();
}
