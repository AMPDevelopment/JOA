package JOA.models.beatmaps;

import JOA.models.beatmaps.compact.BeatmapCompact;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Beatmap extends BeatmapCompact {
    @JsonProperty()
    private float accuracy;

    @JsonProperty()
    private float ar;

    @JsonProperty("beatmapset_id")
    private int beatmapsetId;

    @JsonProperty()
    private int bpm;

    @JsonProperty()
    private boolean convert;

    @JsonProperty("count_circles")
    private int countCircles;

    @JsonProperty("count_sliders")
    private int countSliders;

    @JsonProperty("count_spinners")
    private int countSpinners;

    @JsonProperty()
    private float cs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("deleted_at")
    private String deletedAt; // Timestamp

    @JsonProperty()
    private float drain;

    @JsonProperty("hit_length")
    private int hitLength;

    @JsonProperty("is_scoreable")
    private boolean isScorable;

    @JsonProperty("last_updated")
    private String lastUpdated; // Timestamp

    @JsonProperty("mode_int")
    private int modeInt;

    @JsonProperty("pass_count")
    private int passCount;

    @JsonProperty("play_count")
    private int playCount;

    @JsonProperty()
    private int ranked;

    @JsonProperty()
    private String status;

    @JsonProperty("total_length")
    private int totalLength;

    @JsonProperty()
    private String url;
}
