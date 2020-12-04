package JOA.models.users.compacts;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Cover {
    @JsonProperty("custom_url")
    private String customUrl;

    @JsonProperty()
    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty()
    private String id;

    public String getCustomUrl() {
        return customUrl;
    }

    public String getUrl() {
        return url;
    }

    public String getId() {
        return id;
    }
}
