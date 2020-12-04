package JOA.models.beatmaps;

import JOA.models.beatmaps.compact.BeatmapCompact;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

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
    private Date deletedAt;

    @JsonProperty()
    private float drain;

    @JsonProperty("hit_length")
    private int hitLength;

    @JsonProperty("is_scoreable")
    private boolean isScorable;

    @JsonProperty("last_updated")
    private Date lastUpdated;

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

    public float getAccuracy() {
        return accuracy;
    }

    public float getAr() {
        return ar;
    }

    public int getBeatmapsetId() {
        return beatmapsetId;
    }

    public int getBpm() {
        return bpm;
    }

    public boolean isConvert() {
        return convert;
    }

    public int getCountCircles() {
        return countCircles;
    }

    public int getCountSliders() {
        return countSliders;
    }

    public int getCountSpinners() {
        return countSpinners;
    }

    public float getCs() {
        return cs;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public float getDrain() {
        return drain;
    }

    public int getHitLength() {
        return hitLength;
    }

    public boolean isScorable() {
        return isScorable;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public int getModeInt() {
        return modeInt;
    }

    public int getPassCount() {
        return passCount;
    }

    public int getPlayCount() {
        return playCount;
    }

    public int getRanked() {
        return ranked;
    }

    public String getStatus() {
        return status;
    }

    public int getTotalLength() {
        return totalLength;
    }

    public String getUrl() {
        return url;
    }
}
