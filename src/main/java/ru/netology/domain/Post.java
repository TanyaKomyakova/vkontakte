package ru.netology.domain;

public class Post {
    private int postId;
    private int postData;
    private String postText;
    private String imageUrl;

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getPostData() {
        return postData;
    }

    public void setPostData(int postData) {
        this.postData = postData;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}
