package JOA.models.users.statistics;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Level {
    @JsonProperty()
    private int current;

    @JsonProperty()
    private int progress;
}
