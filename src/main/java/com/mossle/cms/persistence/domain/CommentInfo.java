package com.mossle.cms.persistence.domain;

// Generated by Hibernate Tools
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CommentInfo .
 * 
 * @author Lingo
 */
@Entity
@Table(name = "COMMENT_INFO")
public class CommentInfo implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** null. */
    private Long id;

    /** null. */
    private CommentThread commentThread;

    /** null. */
    private CommentInfo commentInfoByReplyId;

    /** null. */
    private CommentInfo commentInfoByParentId;

    /** null. */
    private String content;

    /** null. */
    private Date createTime;

    /** null. */
    private Date updateTime;

    /** null. */
    private Integer likes;

    /** null. */
    private Integer dislikes;

    /** null. */
    private String userId;

    /** null. */
    private String userName;

    /** null. */
    private String userAvatar;

    /** null. */
    private String mode;

    /** null. */
    private String ip;

    /** null. */
    private String url;

    /** null. */
    private String conversation;

    /** null. */
    private String tenantId;

    /** . */
    private Set<CommentInfo> commentInfosForReplyId = new HashSet<CommentInfo>(
            0);

    /** . */
    private Set<CommentInfo> commentInfosForParentId = new HashSet<CommentInfo>(
            0);

    /** . */
    private Set<CommentVoter> commentVoters = new HashSet<CommentVoter>(0);

    public CommentInfo() {
    }

    public CommentInfo(Long id) {
        this.id = id;
    }

    public CommentInfo(Long id, CommentThread commentThread,
            CommentInfo commentInfoByReplyId,
            CommentInfo commentInfoByParentId, String content, Date createTime,
            Date updateTime, Integer likes, Integer dislikes, String userId,
            String userName, String userAvatar, String mode, String ip,
            String url, String conversation, String tenantId,
            Set<CommentInfo> commentInfosForReplyId,
            Set<CommentInfo> commentInfosForParentId,
            Set<CommentVoter> commentVoters) {
        this.id = id;
        this.commentThread = commentThread;
        this.commentInfoByReplyId = commentInfoByReplyId;
        this.commentInfoByParentId = commentInfoByParentId;
        this.content = content;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.likes = likes;
        this.dislikes = dislikes;
        this.userId = userId;
        this.userName = userName;
        this.userAvatar = userAvatar;
        this.mode = mode;
        this.ip = ip;
        this.url = url;
        this.conversation = conversation;
        this.tenantId = tenantId;
        this.commentInfosForReplyId = commentInfosForReplyId;
        this.commentInfosForParentId = commentInfosForParentId;
        this.commentVoters = commentVoters;
    }

    /** @return null. */
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    /**
     * @param id
     *            null.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** @return null. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "THREAD_ID")
    public CommentThread getCommentThread() {
        return this.commentThread;
    }

    /**
     * @param commentThread
     *            null.
     */
    public void setCommentThread(CommentThread commentThread) {
        this.commentThread = commentThread;
    }

    /** @return null. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "REPLY_ID")
    public CommentInfo getCommentInfoByReplyId() {
        return this.commentInfoByReplyId;
    }

    /**
     * @param commentInfoByReplyId
     *            null.
     */
    public void setCommentInfoByReplyId(CommentInfo commentInfoByReplyId) {
        this.commentInfoByReplyId = commentInfoByReplyId;
    }

    /** @return null. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PARENT_ID")
    public CommentInfo getCommentInfoByParentId() {
        return this.commentInfoByParentId;
    }

    /**
     * @param commentInfoByParentId
     *            null.
     */
    public void setCommentInfoByParentId(CommentInfo commentInfoByParentId) {
        this.commentInfoByParentId = commentInfoByParentId;
    }

    /** @return null. */
    @Column(name = "CONTENT", length = 200)
    public String getContent() {
        return this.content;
    }

    /**
     * @param content
     *            null.
     */
    public void setContent(String content) {
        this.content = content;
    }

    /** @return null. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_TIME", length = 26)
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * @param createTime
     *            null.
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** @return null. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UPDATE_TIME", length = 26)
    public Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @param updateTime
     *            null.
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /** @return null. */
    @Column(name = "LIKES")
    public Integer getLikes() {
        return this.likes;
    }

    /**
     * @param likes
     *            null.
     */
    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    /** @return null. */
    @Column(name = "DISLIKES")
    public Integer getDislikes() {
        return this.dislikes;
    }

    /**
     * @param dislikes
     *            null.
     */
    public void setDislikes(Integer dislikes) {
        this.dislikes = dislikes;
    }

    /** @return null. */
    @Column(name = "USER_ID", length = 64)
    public String getUserId() {
        return this.userId;
    }

    /**
     * @param userId
     *            null.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /** @return null. */
    @Column(name = "USER_NAME", length = 50)
    public String getUserName() {
        return this.userName;
    }

    /**
     * @param userName
     *            null.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /** @return null. */
    @Column(name = "USER_AVATAR", length = 200)
    public String getUserAvatar() {
        return this.userAvatar;
    }

    /**
     * @param userAvatar
     *            null.
     */
    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    /** @return null. */
    @Column(name = "MODE", length = 10)
    public String getMode() {
        return this.mode;
    }

    /**
     * @param mode
     *            null.
     */
    public void setMode(String mode) {
        this.mode = mode;
    }

    /** @return null. */
    @Column(name = "IP", length = 50)
    public String getIp() {
        return this.ip;
    }

    /**
     * @param ip
     *            null.
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /** @return null. */
    @Column(name = "URL", length = 200)
    public String getUrl() {
        return this.url;
    }

    /**
     * @param url
     *            null.
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /** @return null. */
    @Column(name = "CONVERSATION", length = 200)
    public String getConversation() {
        return this.conversation;
    }

    /**
     * @param conversation
     *            null.
     */
    public void setConversation(String conversation) {
        this.conversation = conversation;
    }

    /** @return null. */
    @Column(name = "TENANT_ID", length = 64)
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @param tenantId
     *            null.
     */
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "commentInfoByReplyId")
    public Set<CommentInfo> getCommentInfosForReplyId() {
        return this.commentInfosForReplyId;
    }

    /**
     * @param commentInfosForReplyId
     *            .
     */
    public void setCommentInfosForReplyId(
            Set<CommentInfo> commentInfosForReplyId) {
        this.commentInfosForReplyId = commentInfosForReplyId;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "commentInfoByParentId")
    public Set<CommentInfo> getCommentInfosForParentId() {
        return this.commentInfosForParentId;
    }

    /**
     * @param commentInfosForParentId
     *            .
     */
    public void setCommentInfosForParentId(
            Set<CommentInfo> commentInfosForParentId) {
        this.commentInfosForParentId = commentInfosForParentId;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "commentInfo")
    public Set<CommentVoter> getCommentVoters() {
        return this.commentVoters;
    }

    /**
     * @param commentVoters
     *            .
     */
    public void setCommentVoters(Set<CommentVoter> commentVoters) {
        this.commentVoters = commentVoters;
    }
}