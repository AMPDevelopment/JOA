package JOA.models.beatmapsets.compact;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Nominations {
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
