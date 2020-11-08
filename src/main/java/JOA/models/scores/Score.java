package JOA.models.scores;

import JOA.models.beatmaps.Beatmap;
import JOA.models.beatmapsets.Beatmapset;
import JOA.models.users.User;
import com.fasterxml.jackson.annotation.JsonProperty;

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
    private String createdAt; // Timestamp

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
}
