package JOA.models.users.compacts;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class UserBadge {
    @JsonProperty("awarded_at")
    private Date awardedAt; // Timestamp

    @JsonProperty()
    private String description;

    @JsonProperty("image_url")
    private String imageUrl;

    @JsonProperty()
    private String url;

    public Date getAwardedAt() {
        return awardedAt;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getUrl() {
        return url;
    }
}
