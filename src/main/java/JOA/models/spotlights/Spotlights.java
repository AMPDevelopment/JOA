package JOA.models.spotlights;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Spotlights {
    @JsonProperty()
    private Spotlight[] spotlights;

    public Spotlight[] getSpotlights() {
        return spotlights;
    }
}
