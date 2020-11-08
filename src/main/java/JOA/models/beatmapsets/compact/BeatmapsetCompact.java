package JOA.models.beatmapsets.compact;

import JOA.models.beatmaps.Beatmap;
import JOA.models.users.User;
import JOA.models.users.compacts.UserCompact;

public class BeatmapsetCompact {
    private String artist;
    private String artistUnicode;
    private Covers covers;
    private String creator;
    private int favouriteCount;
    private int id;
    private int playCount;
    private String previewUrl;
    private String source;
    private String status;
    private String title;
    private String titleUnicode;
    private int userId;
    private String video;
    private Beatmap[] beatmaps;
    private Object[] converts; // Todo: Converts into the other GameModes.
    private String description;
    private Genre genre;
    private boolean hasFavourited;
    private Language language;
    private Nominations nominations;
    private int[] ratings;
    private UserCompact[] recentFavourites;
    private User[] relatedUsers;
    private User user;
}
