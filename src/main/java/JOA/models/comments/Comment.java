package JOA.models.comments;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Comment {
    @JsonProperty("commentable_id")
    private int commentableId;

    @JsonProperty("commentable_type")
    private String commentableType;

    @JsonProperty("created_at")
    private Date createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("deleted_at")
    private Date deletedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("edited_at")
    private Date editedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("edited_by_id")
    private int editedById;

    @JsonProperty()
    private int id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("legacy_name")
    private String legacyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("message")
    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("message_html")
    private String messageHtml;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("parent_id")
    private int parentId;

    @JsonProperty()
    private boolean pinned;

    @JsonProperty("replies_count")
    private int repliesCount;

    @JsonProperty("updated_at")
    private String updatedAt;

    @JsonProperty("user_id")
    private int userId;

    @JsonProperty("votes_count")
    private int votesCount;

    public int getCommentableId() {
        return commentableId;
    }

    public String getCommentableType() {
        return commentableType;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public Date getEditedAt() {
        return editedAt;
    }

    public int getEditedById() {
        return editedById;
    }

    public int getId() {
        return id;
    }

    public String getLegacyName() {
        return legacyName;
    }

    public String getMessage() {
        return message;
    }

    public String getMessageHtml() {
        return messageHtml;
    }

    public int getParentId() {
        return parentId;
    }

    public boolean isPinned() {
        return pinned;
    }

    public int getRepliesCount() {
        return repliesCount;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public int getUserId() {
        return userId;
    }

    public int getVotesCount() {
        return votesCount;
    }
}
