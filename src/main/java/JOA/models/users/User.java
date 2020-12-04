package JOA.models.users;

import JOA.models.users.compacts.UserCompact;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class User extends UserCompact {
    @JsonProperty("cover_url")
    private String coverUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty()
    private String discord;

    @JsonProperty("has_supported")
    private boolean hasSupported;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty()
    private String interests;

    @JsonProperty()
    private Kudosu kudosu;

    @JsonProperty()
    private String lastFm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty()
    private String location;

    @JsonProperty()
    private int maxBlocks;

    @JsonProperty()
    private int maxFriends;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty()
    private String occupation;

    @JsonProperty()
    private String playmode;

    @JsonProperty()
    private String[] playstyle;

    @JsonProperty("post_count")
    private int postCount;

    @JsonProperty("profile_order")
    private String[] profileOrder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty()
    private String skype;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty()
    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("title_url")
    private String titleUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty()
    private String twitter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty()
    private String website;

    public String getCoverUrl() {
        return coverUrl;
    }

    public String getDiscord() {
        return discord;
    }

    public boolean isHasSupported() {
        return hasSupported;
    }

    public String getInterests() {
        return interests;
    }

    public Kudosu getKudosu() {
        return kudosu;
    }

    public String getLastFm() {
        return lastFm;
    }

    public String getLocation() {
        return location;
    }

    public int getMaxBlocks() {
        return maxBlocks;
    }

    public int getMaxFriends() {
        return maxFriends;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getPlaymode() {
        return playmode;
    }

    public String[] getPlaystyle() {
        return playstyle;
    }

    public int getPostCount() {
        return postCount;
    }

    public String[] getProfileOrder() {
        return profileOrder;
    }

    public String getSkype() {
        return skype;
    }

    public String getTitle() {
        return title;
    }

    public String getTitleUrl() {
        return titleUrl;
    }

    public String getTwitter() {
        return twitter;
    }

    public String getWebsite() {
        return website;
    }
}
