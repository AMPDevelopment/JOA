package JOA.models.beatmaps.compact;

import JOA.models.beatmapsets.Beatmapset;
import JOA.models.modes.GameMode;
import org.jetbrains.annotations.Nullable;

public class BeatmapCompact {
    private float difficultyRating;
    private int id;
    private GameMode mode;
    private String version;

    @Nullable
    private Object beatmapset; // Beatmapset, BeatmapsetCompact or null possible

    @Nullable
    private String checksum;
    private Failtimes failtimes;
    private int maxCombo;
}
