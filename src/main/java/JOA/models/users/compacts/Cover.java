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
}
