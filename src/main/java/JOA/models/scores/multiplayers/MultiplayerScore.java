package JOA.models.scores.multiplayers;

import JOA.models.users.User;
import JOA.models.users.statistics.UserStatistics;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MultiplayerScore {
    @JsonProperty()
    private int id;

    @JsonProperty("user_id")
    private int userId;

    @JsonProperty("room_id")
    private int roomId;

    @JsonProperty("playlist_item_id")
    private int playlistItemId;

    @JsonProperty("beatmap_id")
    private int beatmapId;

    @JsonProperty()
    private String rank;

    @JsonProperty("total_score")
    private int totalScore;

    @JsonProperty()
    private float accuracy;

    @JsonProperty("max_combo")
    private int maxCombo;

    @JsonProperty()
    private String[] mods;

    @JsonProperty()
    private UserStatistics statistics;

    @JsonProperty()
    private boolean passed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty()
    private int position;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("scores_around")
    private MultiplayerScoresAround scoresAround;

    @JsonProperty()
    private User user;

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public int getRoomId() {
        return roomId;
    }

    public int getPlaylistItemId() {
        return playlistItemId;
    }

    public int getBeatmapId() {
        return beatmapId;
    }

    public String getRank() {
        return rank;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public float getAccuracy() {
        return accuracy;
    }

    public int getMaxCombo() {
        return maxCombo;
    }

    public String[] getMods() {
        return mods;
    }

    public UserStatistics getStatistics() {
        return statistics;
    }

    public boolean isPassed() {
        return passed;
    }

    public int getPosition() {
        return position;
    }

    public MultiplayerScoresAround getScoresAround() {
        return scoresAround;
    }

    public User getUser() {
        return user;
    }
}
