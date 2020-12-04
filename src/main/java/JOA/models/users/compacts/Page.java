package JOA.models.users.compacts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Page {
    @JsonProperty()
    private String html;

    @JsonProperty()
    private String raw;

    public String getHtml() {
        return html;
    }

    public String getRaw() {
        return raw;
    }
}
