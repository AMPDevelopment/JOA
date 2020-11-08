package JOA.models.beatmapsets.compact;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class Descriptor {
    @JsonProperty()
    private int id;

    @JsonProperty()
    private String name;

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
