package JOA.models.scores;

import JOA.models.beatmaps.Beatmap;
import JOA.models.beatmapsets.Beatmapset;
import JOA.models.users.User;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Score {
    @JsonProperty()
    private int id;

    @JsonProperty("best_id")
    private int bestId;

    @JsonProperty("user_id")
    private int userId;

    @JsonProperty()
    private float accuracy;

    @JsonProperty()
    private String[] mods;

    @JsonProperty()
    private int score;

    @JsonProperty("max_combo")
    private int maxCombo;

    @JsonProperty()
    private boolean perfect;

    @JsonProperty()
    private ScoreStatistics statistics;

    @JsonProperty()
    private float pp;

    @JsonProperty()
    private String rank;

    @JsonProperty("created_at")
    private Date createdAt;

    @JsonProperty()
    private String mode;

    @JsonProperty("mode_int")
    private int modeInt;

    @JsonProperty()
    private boolean replay;

    @JsonProperty()
    private Beatmap beatmap;

    @JsonProperty()
    private Beatmapset beatmapset;

    @JsonProperty("rank_country")
    private int rankCountry;

    @JsonProperty("rank_global")
    private int rankGlobal;

    @JsonProperty()
    private float weight;

    @JsonProperty()
    private User user;

    @JsonProperty()
    private Object match; // Todo: Implement the model 'Match'.

    public int getId() {
        return id;
    }

    public int getBestId() {
        return bestId;
    }

    public int getUserId() {
        return userId;
    }

    public float getAccuracy() {
        return accuracy;
    }

    public String[] getMods() {
        return mods;
    }

    public int getScore() {
        return score;
    }

    public int getMaxCombo() {
        return maxCombo;
    }

    public boolean isPerfect() {
        return perfect;
    }

    public ScoreStatistics getStatistics() {
        return statistics;
    }

    public float getPp() {
        return pp;
    }

    public String getRank() {
        return rank;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public String getMode() {
        return mode;
    }

    public int getModeInt() {
        return modeInt;
    }

    public boolean isReplay() {
        return replay;
    }

    public Beatmap getBeatmap() {
        return beatmap;
    }

    public Beatmapset getBeatmapset() {
        return beatmapset;
    }

    public int getRankCountry() {
        return rankCountry;
    }

    public int getRankGlobal() {
        return rankGlobal;
    }

    public float getWeight() {
        return weight;
    }

    public User getUser() {
        return user;
    }

    public Object getMatch() {
        return match;
    }
}
