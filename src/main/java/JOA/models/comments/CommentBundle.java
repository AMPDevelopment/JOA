package JOA.models.comments;

import JOA.models.users.compacts.UserCompact;
import org.jetbrains.annotations.Nullable;

public class CommentBundle {
    private CommentableMeta[] commentableMeta;
    private Comment[] comments;
    private boolean hasMore;

    @Nullable
    private int hasMoreId;
    private Comment[] includedComments;

    @Nullable
    private Comment[] pinnedComments;
    private String sort;
    private int topLevelCount;

    @Nullable
    private int total;
    private boolean userFollow;
    private int[] userVotes;
    private UserCompact[] users;
}
