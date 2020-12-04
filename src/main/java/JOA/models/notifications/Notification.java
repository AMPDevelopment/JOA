package JOA.models.notifications;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Notification {
    @JsonProperty()
    private int id;

    @JsonProperty()
    private String name;

    @JsonProperty("created_at")
    private String createdAt;

    @JsonProperty("object_type")
    private String objectType;

    @JsonProperty("object_id")
    private int objectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("source_user_id")
    private int sourceUserId;

    @JsonProperty("is_read")
    private boolean isRead;

    @JsonProperty()
    private Object details;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getObjectType() {
        return objectType;
    }

    public int getObjectId() {
        return objectId;
    }

    public int getSourceUserId() {
        return sourceUserId;
    }

    public boolean isRead() {
        return isRead;
    }

    public Object getDetails() {
        return details;
    }
}
