package JOA.models.users.compacts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Country {
    @JsonProperty()
    private String code;

    @JsonProperty()
    private String name;
}
