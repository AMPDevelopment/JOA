package JOA.models.scores.multiplayers;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MultiplayerScoresCursor {
    @JsonProperty("score_id")
    private int scoreId;

    @JsonProperty("total_score")
    private int totalScore;

    public int getScoreId() {
        return scoreId;
    }

    public int getTotalScore() {
        return totalScore;
    }
}
