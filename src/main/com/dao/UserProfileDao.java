package main.com.dao;

import main.com.entity.UserProfile;

import java.util.List;

public interface UserProfileDao {

    List<UserProfile> findAll();
    UserProfile findByType(String type);
    UserProfile findById(int id);
}
