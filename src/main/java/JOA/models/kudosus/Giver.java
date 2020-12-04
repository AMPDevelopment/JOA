package JOA.models.kudosus;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Giver {
    @JsonProperty
    private String url;

    @JsonProperty
    private String username;

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }
}
