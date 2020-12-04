package JOA.models.events;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    @JsonProperty
    private String username;

    @JsonProperty
    private String url;

    @JsonProperty("previous_username")
    private String previousUsername; // Only for usernameChanged event.

    public String getUsername() {
        return username;
    }

    public String getUrl() {
        return url;
    }

    public String getPreviousUsername() {
        return previousUsername;
    }
}
