package JOA.models.users;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Kudosu {
    @JsonProperty()
    private int total;

    @JsonProperty()
    private int available;

    public int getTotal() {
        return this.total;
    }

    public int getAvailable() {
        return this.available;
    }
}
