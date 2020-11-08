package JOA.models.scores.multiplayers;

import org.jetbrains.annotations.Nullable;

public class MultiplayerScores {
    private MultiplayerScoresCursor cursor;
    private Object params;
    private MultiplayerScore[] scores;

    @Nullable
    private int total;

    @Nullable
    private MultiplayerScore userScore;
}
