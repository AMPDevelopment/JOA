package JOA.models.users.compacts;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class UserAchievement {
    @JsonProperty("achieved_at")
    private Date achievedAt;

    @JsonProperty("achievement_id")
    private int achievementId;

    public Date getAchievedAt() {
        return achievedAt;
    }

    public int getAchievementId() {
        return achievementId;
    }
}
