package JOA.models.kudosus;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Post {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty()
    private String url;

    @JsonProperty()
    private String title;
}
