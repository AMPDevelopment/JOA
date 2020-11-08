package JOA.models.users.compacts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserAchievement {
    @JsonProperty("achieved_at")
    private String achievedAt; // Timestamp

    @JsonProperty("achievement_id")
    private int achievementId;
}
