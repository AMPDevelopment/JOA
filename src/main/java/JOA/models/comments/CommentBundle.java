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
}
