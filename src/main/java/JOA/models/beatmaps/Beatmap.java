package JOA.models.beatmaps;

import JOA.models.beatmaps.compact.BeatmapCompact;
import org.jetbrains.annotations.Nullable;

import java.sql.Timestamp;

public class Beatmap extends BeatmapCompact {
    private float accuracy;
    private float ar;
    private int beatmapsetId;
    private float bpm;
    private boolean convert;
    private int countCircles;
    private int countSliders;
    private int countSpinners;
    private float cs;

    @Nullable
    private Timestamp deletedAt;
    private float drain;
    private int hitLength;
    private boolean isScorable; // API: is_scoreable
    private Timestamp lastUpdated;
    private int modeInt;
    private int passCount;
    private int playCount;
    private int ranked;
    private String status;
    private int totalLength;
    private String url;
}
