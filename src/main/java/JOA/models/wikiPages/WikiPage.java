package JOA.models.wikiPages;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class WikiPage {
    @JsonProperty()
    private String layout;

    @JsonProperty()
    private String locale;

    @JsonProperty()
    private String markdown;

    @JsonProperty()
    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty()
    private String subtitle;

    @JsonProperty()
    private String[] tags;

    @JsonProperty()
    private String title;
}
