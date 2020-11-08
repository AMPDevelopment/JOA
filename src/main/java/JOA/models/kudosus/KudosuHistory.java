package JOA.models.kudosus;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class KudosuHistory {
    @JsonProperty()
    private int id;

    @JsonProperty()
    private KudosuAction action;

    @JsonProperty()
    private int amount;

    @JsonProperty()
    private String model;

    @JsonProperty("created_at")
    private String createdAt; // Timestamp

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty()
    private Giver giver;

    @JsonProperty()
    private Post post;
}
