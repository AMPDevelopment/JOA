package JOA.models.users.compacts;

import JOA.models.groups.Group;
import JOA.models.users.statistics.UserStatistics;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserCompact {
    @JsonProperty("avatar_url")
    private String avatarUrl;

    @JsonProperty("country_code")
    private String countryCode;

    @JsonProperty("default_group")
    private String defaultGroup;

    @JsonProperty()
    private int id;

    @JsonProperty("is_active")
    private boolean isActive;

    @JsonProperty("is_bot")
    private boolean isBot;

    @JsonProperty("is_online")
    private boolean isOnline;

    @JsonProperty("is_supporter")
    private boolean isSupporter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("last_visit")
    private String lastVisit; // Timestamp

    @JsonProperty("pm_friends_only")
    private boolean pmFriendsOnly;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("profile_colour")
    private String profileColor;

    @JsonProperty()
    private String username;

    @JsonProperty("user_account_histories")
    private UserAccountHistory[] userAccountHistories;

    @JsonProperty("active_tournament_banner")
    private ProfileBanner activeTournamentBanner;

    @JsonProperty()
    private UserBadge[] badges;

    @JsonProperty("beatmap_playcounts_count")
    private int beatmapPlaycountsCount;

    @JsonProperty()
    private Country country;

    @JsonProperty()
    private Cover cover;

    @JsonProperty("favourite_beatmapset_count")
    private int favouriteBeatmapsetCount;

    @JsonProperty("folower_count")
    private int followerCount;

    @JsonProperty("graveyard_beatmapset_count")
    private int graveyardBeatmapSetCount;

    @JsonProperty()
    private Group[] groups;

    @JsonProperty("is_admin")
    private boolean isAdmin;

    @JsonProperty("is_bng")
    private boolean isBng;

    @JsonProperty("is_full_bn")
    private boolean isFullBn;

    @JsonProperty("is_gmt")
    private boolean isGmt;

    @JsonProperty("is_limited_bn")
    private boolean isLimitedBn;

    @JsonProperty("is_moderator")
    private boolean isModerator;

    @JsonProperty("is_nat")
    private boolean isNat;

    @JsonProperty("is_restricted")
    private boolean isRestricted;

    @JsonProperty("is_silenced")
    private boolean isSilenced;

    @JsonProperty("loved_beatmapset_count")
    private int lovedBeatmapsetCount;

    @JsonProperty("monthly_playcounts")
    private UserMonthlyPlaycount[] monthlyPlaycounts;

    @JsonProperty()
    private Page page;

    @JsonProperty("previous_usernames")
    private String[] previousUsernames;

    @JsonProperty("ranked_and_approved_beatmapset_count")
    private int rankedAndApprovedBeatmapsetCount;

    @JsonProperty("replays_watched_counts")
    private UserMonthlyReplaysWatchedCounts[] replaysWatchedCounts;

    @JsonProperty("scores_best_count")
    private int scoresBestCount;

    @JsonProperty("scores_first_count")
    private int scoresFirstCount;

    @JsonProperty("scores_recent_count")
    private int scoresRecentCount;

    @JsonProperty()
    private UserStatistics statistics;

    @JsonProperty("support_level")
    private int supportLevel;

    @JsonProperty("unranked_beatmapset_count")
    private int unrankedBeatmapsetCount;

    @JsonProperty("user_achievements")
    private UserAchievement[] userAchievements;

    @JsonProperty("rank_history")
    private RankHistory rankHistory;

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public String getDefaultGroup() {
        return this.defaultGroup;
    }

    public int getId() {
        return this.id;
    }

    public boolean getIsActive() {
        return this.isActive;
    }

    public boolean getIsBot() {
        return this.isBot;
    }

    public boolean getIsOnline() {
        return this.isOnline;
    }

    public boolean getIsSupporter() {
        return this.isSupporter;
    }

    public String getLastVisit() {
        return this.lastVisit;
    }

    public boolean getPmFriendsOnly() {
        return this.pmFriendsOnly;
    }

    public String getProfileColor() {
        return this.profileColor;
    }

    public String getUsername() {
        return this.username;
    }

    public boolean isActive() {
        return isActive;
    }
}
