package JOA.models.users.compacts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RankHistory {
    @JsonProperty()
    private String mode;

    @JsonProperty()
    private int[] data;
}
