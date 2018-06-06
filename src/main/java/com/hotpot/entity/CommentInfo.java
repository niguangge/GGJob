package com.hotpot.entity;

import java.util.Date;

public class CommentInfo {
    private Integer commentId;

    private Integer offerId;

    private Integer commentorId;

    private Date commentTime;

    private String commentContent;

    private Integer likeNumber;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getOfferId() {
        return offerId;
    }

    public void setOfferId(Integer offerId) {
        this.offerId = offerId;
    }

    public Integer getCommentorId() {
        return commentorId;
    }

    public void setCommentorId(Integer commentorId) {
        this.commentorId = commentorId;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }

    public Integer getLikeNumber() {
        return likeNumber;
    }

    public void setLikeNumber(Integer likeNumber) {
        this.likeNumber = likeNumber;
    }
}