package JOA.models.users.statistics;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Level {
    @JsonProperty()
    private int current;

    @JsonProperty()
    private int progress;

    public int getCurrent() {
        return current;
    }

    public int getProgress() {
        return progress;
    }
}
