package JOA.models.beatmaps.compact;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BeatmapCompact {
    @JsonProperty("difficulty_rating")
    private float difficultyRating;

    @JsonProperty()
    private int id;

    @JsonProperty()
    private String mode;

    @JsonProperty()
    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty()
    private Object beatmapset; // Beatmapset, BeatmapsetCompact or null possible

    @JsonProperty()
    private Failtimes failtimes;

    @JsonProperty("max_combo")
    private int maxCombo;

    public float getDifficultyRating() {
        return difficultyRating;
    }

    public int getId() {
        return id;
    }

    public String getMode() {
        return mode;
    }

    public String getVersion() {
        return version;
    }

    public Object getBeatmapset() {
        return beatmapset;
    }

    public Failtimes getFailtimes() {
        return failtimes;
    }

    public int getMaxCombo() {
        return maxCombo;
    }
}
