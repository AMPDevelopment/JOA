package JOA.models.beatmaps.compact;

import JOA.models.beatmapsets.Beatmapset;
import JOA.models.modes.GameMode;

public class BeatmapCompact {
    private float difficultyRating;
    private int id;
    private GameMode mode;
    private String version;
    private Beatmapset beatmapset;
    private String checksum;
    private Failtimes failtimes;
    private int maxCombo;
}
