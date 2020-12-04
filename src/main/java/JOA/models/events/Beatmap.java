package JOA.models.events;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Beatmap {
    @JsonProperty
    private String title;

    @JsonProperty
    private String url;

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }
}
