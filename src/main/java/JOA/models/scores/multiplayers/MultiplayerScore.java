package JOA.models.scores.multiplayers;

import JOA.models.users.User;
import JOA.models.users.statistics.UserStatistics;
import org.jetbrains.annotations.Nullable;

public class MultiplayerScore {
    private int id;
    private int userId;
    private int roomId;
    private int playlistItemId;
    private int beatmapId;
    private String rank;
    private int totalScore;
    private float accuracy;
    private int maxCombo;
    private String[] mods;
    private UserStatistics statistics;
    private boolean passed;

    @Nullable
    private int position;

    @Nullable
    private MultiplayerScoresAround scoresAround;
    private User user;
}
