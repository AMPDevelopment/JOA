package JOA.models.comments;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CommentableMeta {
    @JsonProperty()
    private int id;

    @JsonProperty()
    private String title;

    @JsonProperty()
    private String type;

    @JsonProperty()
    private String url;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public String getUrl() {
        return url;
    }
}
