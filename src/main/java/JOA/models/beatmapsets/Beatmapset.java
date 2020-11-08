package JOA.models.beatmapsets;

import JOA.models.beatmapsets.compact.BeatmapsetCompact;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

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
    private String lastUpdated; // Timestamp

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("legacy_thread_url")
    private String legacyThreadUrl;

    @JsonProperty()
    private int ranked;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("ranked_date")
    private String rankedDate; // Timestamp

    @JsonProperty()
    private String source;

    @JsonProperty()
    private boolean storyboard;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("submitted_date")
    private String submittedDate; // Timestamp

    @JsonProperty()
    private String tags;
}
