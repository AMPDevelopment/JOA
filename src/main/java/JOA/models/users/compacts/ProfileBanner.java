package JOA.models.users.compacts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProfileBanner {
    @JsonProperty()
    private int id;

    @JsonProperty("tournament_id")
    private int tournamentId;

    @JsonProperty()
    private String image;
}
