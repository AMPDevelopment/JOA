package JOA.models.users.statistics;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rank {
    @JsonProperty()
    private int global;

    @JsonProperty()
    private int country;
}
