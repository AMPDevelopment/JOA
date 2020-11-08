package JOA.models.beatmapsets;

import JOA.models.beatmapsets.compact.BeatmapsetCompact;
import org.jetbrains.annotations.Nullable;

import java.sql.Timestamp;

public class Beatmapset extends BeatmapsetCompact {
    private Availability availability;
    private int bpm;
    private boolean canBeHyped;
    private String creator;
    private boolean discussionEnabled;
    private boolean discussionLocked;
    private Hype hype;
    private boolean isScorable; // API: is_scoreable
    private String lastUpdated; // Timestamp

    @Nullable
    private String legacyThreadUrl;
    private int ranked;

    @Nullable
    private String rankedDate; // Timestamp
    private String source;
    private boolean storyboard;

    @Nullable
    private String submittedDate; // Timestamp
    private String tags;
}
