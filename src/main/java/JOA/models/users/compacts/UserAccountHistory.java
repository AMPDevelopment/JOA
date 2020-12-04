package JOA.models.users.compacts;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class UserAccountHistory {
    @JsonProperty()
    private int id;

    @JsonProperty()
    private String type;

    @JsonProperty()
    private Date timestamp;

    @JsonProperty()
    private int length;

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public int getLength() {
        return length;
    }
}
