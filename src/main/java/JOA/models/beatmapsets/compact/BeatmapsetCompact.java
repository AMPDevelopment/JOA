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

    public String getArtist() {
        return artist;
    }

    public String getArtistUnicode() {
        return artistUnicode;
    }

    public Covers getCovers() {
        return covers;
    }

    public String getCreator() {
        return creator;
    }

    public int getFavouriteCount() {
        return favouriteCount;
    }

    public int getId() {
        return id;
    }

    public int getPlayCount() {
        return playCount;
    }

    public String getPreviewUrl() {
        return previewUrl;
    }

    public String getSource() {
        return source;
    }

    public String getStatus() {
        return status;
    }

    public String getTitle() {
        return title;
    }

    public String getTitleUnicode() {
        return titleUnicode;
    }

    public int getUserId() {
        return userId;
    }

    public String getVideo() {
        return video;
    }

    public Beatmap[] getBeatmaps() {
        return beatmaps;
    }

    public Object[] getConverts() {
        return converts;
    }

    public String getDescription() {
        return description;
    }

    public Genre getGenre() {
        return genre;
    }

    public boolean isHasFavourited() {
        return hasFavourited;
    }

    public Language getLanguage() {
        return language;
    }

    public Nominations getNominations() {
        return nominations;
    }

    public int[] getRatings() {
        return ratings;
    }

    public UserCompact[] getRecentFavourites() {
        return recentFavourites;
    }

    public User[] getRelatedUsers() {
        return relatedUsers;
    }

    public User getUser() {
        return user;
    }
}
