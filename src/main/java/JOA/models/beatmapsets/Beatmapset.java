package JOA.models.beatmapsets;

import JOA.models.beatmapsets.compact.BeatmapsetCompact;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Beatmapset extends BeatmapsetCompact {
    @JsonProperty()
    private Availability availability;

    @JsonProperty()
    private int bpm;

    @JsonProperty("can_be_hyped")
    private boolean canBeHyped;

    @JsonProperty()
    private String creator;

    @JsonProperty("discussion_enabled")
    private boolean discussionEnabled;

    @JsonProperty("discussion_locked")
    private boolean discussionLocked;

    @JsonProperty()
    private Hype hype;

    @JsonProperty("is_scoreable")
    private boolean isScorable;

    @JsonProperty("last_updated")
    private Date lastUpdated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("legacy_thread_url")
    private String legacyThreadUrl;

    @JsonProperty()
    private int ranked;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("ranked_date")
    private Date rankedDate;

    @JsonProperty()
    private String source;

    @JsonProperty()
    private boolean storyboard;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("submitted_date")
    private Date submittedDate;

    @JsonProperty()
    private String tags;

    public Availability getAvailability() {
        return availability;
    }

    public int getBpm() {
        return bpm;
    }

    public boolean isCanBeHyped() {
        return canBeHyped;
    }

    public String getCreator() {
        return creator;
    }

    public boolean isDiscussionEnabled() {
        return discussionEnabled;
    }

    public boolean isDiscussionLocked() {
        return discussionLocked;
    }

    public Hype getHype() {
        return hype;
    }

    public boolean isScorable() {
        return isScorable;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public String getLegacyThreadUrl() {
        return legacyThreadUrl;
    }

    public int getRanked() {
        return ranked;
    }

    public Date getRankedDate() {
        return rankedDate;
    }

    public String getSource() {
        return source;
    }

    public boolean isStoryboard() {
        return storyboard;
    }

    public Date getSubmittedDate() {
        return submittedDate;
    }

    public String getTags() {
        return tags;
    }
}
