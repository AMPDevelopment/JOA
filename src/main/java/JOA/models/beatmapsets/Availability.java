package JOA.models.beatmapsets;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Availability {
    @JsonProperty("download_disabled")
    private boolean downloadDisabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("more_information")
    private String moreInformation;
}
