package JOA.models.scores.multiplayers;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MultiplayerScores {
    @JsonProperty()
    private MultiplayerScoresCursor cursor;

    @JsonProperty()
    private Object params;

    @JsonProperty()
    private MultiplayerScore[] scores;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty()
    private int total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("user_score")
    private MultiplayerScore userScore;

    public MultiplayerScoresCursor getCursor() {
        return cursor;
    }

    public Object getParams() {
        return params;
    }

    public MultiplayerScore[] getScores() {
        return scores;
    }

    public int getTotal() {
        return total;
    }

    public MultiplayerScore getUserScore() {
        return userScore;
    }
}
