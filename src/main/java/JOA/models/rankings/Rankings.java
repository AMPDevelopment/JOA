package JOA.models.rankings;

import JOA.models.beatmapsets.Beatmapset;
import JOA.models.cursor.Cursor;
import JOA.models.spotlights.Spotlight;
import JOA.models.users.statistics.UserStatistics;
import org.jetbrains.annotations.Nullable;

public class Rankings {
    @Nullable
    private Beatmapset[] beatmapsets;
    private Cursor cursor;
    private UserStatistics ranking;

    @Nullable
    private Spotlight spotlight;
    private int total;
}
