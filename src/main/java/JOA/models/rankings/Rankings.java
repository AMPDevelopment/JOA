package JOA.models.rankings;

import JOA.models.beatmapsets.Beatmapset;
import JOA.models.cursor.Cursor;
import JOA.models.spotlights.Spotlight;
import JOA.models.users.statistics.UserStatistics;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Rankings {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty()
    private Beatmapset[] beatmapsets;

    @JsonProperty()
    private Cursor cursor;

    @JsonProperty()
    private UserStatistics ranking;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty()
    private Spotlight spotlight;

    @JsonProperty()
    private int total;

    public Beatmapset[] getBeatmapsets() {
        return beatmapsets;
    }

    public Cursor getCursor() {
        return cursor;
    }

    public UserStatistics getRanking() {
        return ranking;
    }

    public Spotlight getSpotlight() {
        return spotlight;
    }

    public int getTotal() {
        return total;
    }
}
