package JOA.models.users.statistics;

import JOA.models.users.compacts.UserCompact;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserStatistics {
    @JsonProperty("grade_counts")
    private GradeCounts gradeCounts;

    @JsonProperty("hit_accuracy")
    private float hitAccuracy;

    @JsonProperty("is_ranked")
    private boolean isRanked;

    @JsonProperty()
    private Level level;

    @JsonProperty("maximum_combo")
    private int maximumCombo;

    @JsonProperty("play_count")
    private int playCount;

    @JsonProperty("play_time")
    private int playTime;

    @JsonProperty()
    private float pp;

    @JsonProperty("pp_rank")
    private int ppRank;

    @JsonProperty("ranked_score")
    private int rankedScore;

    @JsonProperty("replays_watched_by_others")
    private int replaysWatchedByOthers;

    @JsonProperty("total_hits")
    private int totalHits;

    @JsonProperty("total_score")
    private int totalScore;

    @JsonProperty()
    private UserCompact user;

    public GradeCounts getGradeCounts() {
        return gradeCounts;
    }

    public float getHitAccuracy() {
        return hitAccuracy;
    }

    public boolean isRanked() {
        return isRanked;
    }

    public Level getLevel() {
        return level;
    }

    public int getMaximumCombo() {
        return maximumCombo;
    }

    public int getPlayCount() {
        return playCount;
    }

    public int getPlayTime() {
        return playTime;
    }

    public float getPp() {
        return pp;
    }

    public int getPpRank() {
        return ppRank;
    }

    public int getRankedScore() {
        return rankedScore;
    }

    public int getReplaysWatchedByOthers() {
        return replaysWatchedByOthers;
    }

    public int getTotalHits() {
        return totalHits;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public UserCompact getUser() {
        return user;
    }
}
