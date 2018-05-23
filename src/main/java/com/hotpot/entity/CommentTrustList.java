package com.hotpot.entity;

public class CommentTrustList {
    private Integer commentId;

    private String userId;

    private Byte isTrust;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Byte getIsTrust() {
        return isTrust;
    }

    public void setIsTrust(Byte isTrust) {
        this.isTrust = isTrust;
    }
}