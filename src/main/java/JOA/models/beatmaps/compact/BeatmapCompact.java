package JOA.models.beatmaps.compact;

import org.jetbrains.annotations.Nullable;

public class BeatmapCompact {
    private float difficultyRating;
    private int id;
    private String mode;
    private String version;

    @Nullable
    private Object beatmapset; // Beatmapset, BeatmapsetCompact or null possible
    private Failtimes failtimes;
    private int maxCombo;
}
