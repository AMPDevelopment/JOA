package JOA.models.beatmapsets;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Hype {
    @JsonProperty()
    private int current;

    @JsonProperty()
    private int required;

    public int getCurrent() {
        return current;
    }

    public int getRequired() {
        return required;
    }
}
