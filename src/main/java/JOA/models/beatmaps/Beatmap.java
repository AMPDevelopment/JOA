package JOA.models.beatmaps;

import JOA.models.beatmaps.compact.BeatmapCompact;
import org.jetbrains.annotations.Nullable;

public class Beatmap extends BeatmapCompact {
    private float accuracy;
    private float ar;
    private int beatmapsetId;
    private int bpm;
    private boolean convert;
    private int countCircles;
    private int countSliders;
    private int countSpinners;
    private float cs;

    @Nullable
    private String deletedAt; // Timestamp
    private float drain;
    private int hitLength;
    private boolean isScorable; // API: is_scoreable
    private String lastUpdated; // Timestamp
    private int modeInt;
    private int passCount;
    private int playCount;
    private int ranked;
    private String status;
    private int totalLength;
    private String url;
}
