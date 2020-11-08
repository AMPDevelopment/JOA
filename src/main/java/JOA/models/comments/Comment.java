package JOA.models.comments;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Comment {
    @JsonProperty("commentable_id")
    private int commentableId;

    @JsonProperty("commentable_type")
    private String commentableType;

    @JsonProperty("created_at")
    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("deleted_at")
    private String deletedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("edited_at")
    private String editedAt;

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
}
