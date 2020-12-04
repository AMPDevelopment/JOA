package JOA.models.comments;

import JOA.models.users.compacts.UserCompact;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CommentBundle {
    @JsonProperty("commentable_meta")
    private CommentableMeta[] commentableMeta;

    @JsonProperty()
    private Comment[] comments;

    @JsonProperty("has_more")
    private boolean hasMore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("has_more_id")
    private int hasMoreId;

    @JsonProperty("included_comments")
    private Comment[] includedComments;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("pinned_comments")
    private Comment[] pinnedComments;

    @JsonProperty()
    private String sort;

    @JsonProperty("top_level_count")
    private int topLevelCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty()
    private int total;

    @JsonProperty("user_follow")
    private boolean userFollow;

    @JsonProperty("user_votes")
    private int[] userVotes;

    @JsonProperty()
    private UserCompact[] users;

    public CommentableMeta[] getCommentableMeta() {
        return commentableMeta;
    }

    public Comment[] getComments() {
        return comments;
    }

    public boolean isHasMore() {
        return hasMore;
    }

    public int getHasMoreId() {
        return hasMoreId;
    }

    public Comment[] getIncludedComments() {
        return includedComments;
    }

    public Comment[] getPinnedComments() {
        return pinnedComments;
    }

    public String getSort() {
        return sort;
    }

    public int getTopLevelCount() {
        return topLevelCount;
    }

    public int getTotal() {
        return total;
    }

    public boolean isUserFollow() {
        return userFollow;
    }

    public int[] getUserVotes() {
        return userVotes;
    }

    public UserCompact[] getUsers() {
        return users;
    }
}
