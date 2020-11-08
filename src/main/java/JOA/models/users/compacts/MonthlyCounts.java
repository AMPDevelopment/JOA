package JOA.models.users.compacts;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public abstract class MonthlyCounts {
    @JsonProperty("start_date")
    private Date startDate;

    @JsonProperty()
    private int count;
}
