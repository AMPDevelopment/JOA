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
}
