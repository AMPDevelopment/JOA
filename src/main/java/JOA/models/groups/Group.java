package JOA.models.groups;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Group {
    @JsonProperty()
    private int id;

    @JsonProperty()
    private String identifier;

    @JsonProperty("is_probationary")
    private boolean isProbationary;

    @JsonProperty()
    private String name;

    @JsonProperty("short_name")
    private String shortName;

    @JsonProperty()
    private String description;

    @JsonProperty("colour")
    private String color;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty()
    private String[] playmodes;
}

