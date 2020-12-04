package JOA.util;

import JOA.models.beatmaps.BeatmapType;
import JOA.models.modes.GameMode;
import JOA.models.rankings.RankingType;
import JOA.models.scores.ScoreType;

public class JOAConverter {

    public static String gameModeToString(GameMode gameMode) {
        switch (gameMode) {
            case OSU:
                return "osu";
            case MANIA:
                return "mania";
            case FRUITS:
                return "fruits";
            case TAIKO:
                return "taiko";
            default:
                throw new IllegalStateException("Unexpected value: " + gameMode);
        }
    }

    public static String scoreTypeToString(ScoreType scoreType) {
        switch (scoreType) {
            case BEST:
                return "best";
            case FIRSTS:
                return "firsts";
            case RECENT:
                return "recent";
            default:
                throw new IllegalStateException("Unexpected value: " + scoreType);
        }
    }

    public static String rankingTypeToString(RankingType rankingType) {
        switch (rankingType) {
            case CHARTS:
                return "charts";
            case COUNTRY:
                return "country";
            case PERFORMANCE:
                return "performance";
            case SCORE:
                return "score";
            default:
                throw new IllegalStateException("Unexpected value: " + rankingType);
        }
    }

    public static String beatmapTypeToString(BeatmapType beatmapType) {
        switch (beatmapType) {
            case FAVOURITE:
                return "favourite";
            case GRAVEYARD:
                return "graveyard";
            case LOVED:
                return "loved";
            case MOST_PLAYED:
                return "most_played";
            case RANKED_AND_APPROVED:
                return "ranked_and_approved";
            case UNRANKED:
                return "unranked";
            default:
                throw new IllegalStateException("Unexpected value: " + beatmapType);
        }
    }
}
