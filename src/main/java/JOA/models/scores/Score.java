package JOA.models.scores;

import JOA.models.beatmaps.Beatmap;
import JOA.models.beatmapsets.Beatmapset;
import JOA.models.users.User;

public class Score {
    private int id;
    private int bestId;
    private int userId;
    private float accuracy;
    private String[] mods;
    private int score;
    private int maxCombo;
    private boolean perfect;
    private ScoreStatistics statistics;
    private float pp;
    private String rank;
    private String createdAt; // Timestamp
    private String mode;
    private int modeInt;
    private boolean replay;
    private Beatmap beatmap;
    private Beatmapset beatmapset;
    private int rankCountry;
    private int rankGlobal;
    private float weight;
    private User user;
    private Object match; // Todo: Implement the model 'Match'.
}
