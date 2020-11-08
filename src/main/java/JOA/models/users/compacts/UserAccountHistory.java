package JOA.models.users.compacts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserAccountHistory {
    @JsonProperty()
    private int id;

    @JsonProperty()
    private String type;

    @JsonProperty()
    private String timestamp; // Timestamp

    @JsonProperty()
    private int length;
}
