package JOA.models.scores.multiplayers;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MultiplayerScoresAround {
    @JsonProperty()
    private MultiplayerScores higher;

    @JsonProperty()
    private MultiplayerScores lower;
}
