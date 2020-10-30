package JOA.models.comments;

import org.jetbrains.annotations.Nullable;

public class Comment {
    private int commentableId;
    private String commentableType;
    private String createdAt;

    @Nullable
    private String deletedAt;

    @Nullable
    private String editedAt;

    @Nullable
    private int editedById;
    private int id;

    @Nullable
    private String legacyName;

    @Nullable
    private String message;

    @Nullable
    private String messageHtml;

    @Nullable
    private int parentId;
    private boolean pinned;
    private int repliesCount;
    private String updatedAt;
    private int userId;
    private int votesCount;
}
