package JOA.models.beatmapsets.compact;

import JOA.models.beatmaps.Beatmap;
import JOA.models.users.User;
import JOA.models.users.compacts.UserCompact;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BeatmapsetCompact {
    @JsonProperty()
    private String artist;

    @JsonProperty("artist_unicode")
    private String artistUnicode;

    @JsonProperty()
    private Covers covers;

    @JsonProperty()
    private String creator;

    @JsonProperty("favourite_count")
    private int favouriteCount;

    @JsonProperty()
    private int id;

    @JsonProperty("play_count")
    private int playCount;

    @JsonProperty("preview_url")
    private String previewUrl;

    @JsonProperty()
    private String source;

    @JsonProperty()
    private String status;

    @JsonProperty()
    private String title;

    @JsonProperty("title_unicode")
    private String titleUnicode;

    @JsonProperty("user_id")
    private int userId;

    @JsonProperty()
    private String video;

    @JsonProperty()
    private Beatmap[] beatmaps;

    @JsonProperty()
    private Object[] converts; // Todo: Converts into the other GameModes.

    @JsonProperty()
    private String description;

    @JsonProperty()
    private Genre genre;

    @JsonProperty("has_favourited")
    private boolean hasFavourited;

    @JsonProperty()
    private Language language;

    @JsonProperty()
    private Nominations nominations;

    @JsonProperty()
    private int[] ratings;

    @JsonProperty("recent_favourites")
    private UserCompact[] recentFavourites;

    @JsonProperty("related_userse")
    private User[] relatedUsers;

    @JsonProperty()
    private User user;
}
