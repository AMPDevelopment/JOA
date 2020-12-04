package JOA.models.spotlights;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Spotlight {
    @JsonProperty("end_date")
    private Date endDate;

    @JsonProperty()
    private int id;

    @JsonProperty("mode_specific")
    private boolean modeSpecific;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("participant_count")
    private int participantCount;

    @JsonProperty()
    private String name;

    @JsonProperty("start_date")
    private Date startDate;

    @JsonProperty()
    private String type;

    public Date getEndDate() {
        return endDate;
    }

    public int getId() {
        return id;
    }

    public boolean isModeSpecific() {
        return modeSpecific;
    }

    public int getParticipantCount() {
        return participantCount;
    }

    public String getName() {
        return name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public String getType() {
        return type;
    }
}
