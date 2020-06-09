package ru.netology.domain;

public class PublicationsPage {
    private PostInformation[] postInformations;
    private RepostsForPublication[] repostsForPublications;
    private ViewPublication [] viewPublications;
    private LikesForPublication [] likesForPublications;
    private PostComment [] postComments;

    private String toComplain;
    private String saveToBookmarks;

    public String generate() {
        for (PostInformation post : postInformations) {
            String block = post.generateBlock();
        }
        // TODO: add logic
        return null;

        for (RepostsForPublication repost : repostsForPublications) {
            String block = repost.generateBlock();
        }
        // TODO: add logic
        return null;

        for (ViewPublication viev : viewPublications) {
            String block = viev.generateBlock();
        }
        // TODO: add logic
        return null;

        for (LikesForPublication like : likesForPublications) {
            String block = like.generateBlock();
        }
        // TODO: add logic
        return null;

        for (PostComment post : postComments) {
            String block = post.generateBlock();
        }
        // TODO: add logic
        return null;
    }
}
