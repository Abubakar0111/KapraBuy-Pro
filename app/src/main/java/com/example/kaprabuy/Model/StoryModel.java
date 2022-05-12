package com.example.kaprabuy.Model;

public class StoryModel {
    int stroy, storyType;
    int profile;
    String name;

    public StoryModel(int stroy, int storyType, int profile, String name) {
        this.stroy = stroy;
        this.storyType = storyType;
        this.profile = profile;
        this.name = name;
    }



    public int getStroy() {
        return stroy;
    }

    public void setStroy(int stroy) {
        this.stroy = stroy;
    }

    public int getStoryType() {
        return storyType;
    }

    public void setStoryType(int storyType) {
        this.storyType = storyType;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
