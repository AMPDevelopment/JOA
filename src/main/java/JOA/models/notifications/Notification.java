package JOA.models.notifications;

import org.jetbrains.annotations.Nullable;

public class Notification {
    private int id;
    private String name;
    private String createdAt;
    private String objectType;
    private int objectId;

    @Nullable
    private int sourceUserId;
    private boolean isRead;
    private Object details;
}
