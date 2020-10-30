package JOA.models.comments;

import JOA.models.users.compacts.UserCompact;

public class CommentBundle {
    private CommentableMeta[] commentableMeta;
    private Comment[] comments;
    private boolean hasMore;
    private int hasMoreId;
    private Comment[] includedComments;
    private Comment[] pinnedComments;
    private String sort;
    private int topLevelCount;
    private int total;
    private boolean userFollow;
    private int[] userVotes;
    private UserCompact[] users;
}
