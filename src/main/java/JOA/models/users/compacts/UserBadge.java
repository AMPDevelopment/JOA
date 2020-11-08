package JOA.models.users.compacts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserBadge {
    @JsonProperty("awarded_at")
    private String awardedAt; // Timestamp

    @JsonProperty()
    private String description;

    @JsonProperty("image_url")
    private String imageUrl;

    @JsonProperty()
    private String url;
}
