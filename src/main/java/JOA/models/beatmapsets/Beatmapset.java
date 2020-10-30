package JOA.models.beatmapsets;

import JOA.models.beatmapsets.compact.BeatmapsetCompact;
import org.jetbrains.annotations.Nullable;

import java.sql.Timestamp;

public class Beatmapset extends BeatmapsetCompact {
    private Availability availability;
    private float bpm;
    private boolean canBeHyped;
    private String creator;
    private boolean discussionEnabled;
    private boolean discussionLocked;
    private Hype hype;
    private boolean isScorable; // API: is_scoreable
    private Timestamp lastUpdated;

    @Nullable
    private String legacyThreadUrl;
    private int ranked;

    @Nullable
    private Timestamp rankedDate;
    private String source;
    private boolean storyboard;

    @Nullable
    private Timestamp submittedDate;
    private String tags;
}
