package JOA.models.users.compacts;

import JOA.models.groups.Group;
import JOA.models.users.statistics.UserStatistics;
import org.jetbrains.annotations.Nullable;

import java.sql.Timestamp;

public class UserCompact {
    private String avatarUrl;
    private String countryCode;
    private String defaultGroup;
    private int id;
    private boolean isActive;
    private boolean isBot;
    private boolean isOnline;
    private boolean isSupporter;

    @Nullable
    private String lastVisit; // Timestamp
    private boolean pmFriendsOnly;

    @Nullable
    private String profileColor;
    private String username;
    private UserAccountHistory[] userAccountHistories;
    private ProfileBanner activeTournamentBanner;
    private UserBadge[] badges;
    private int beatmapPlaycountsCount;
    private Object blocks;
    private Country country;
    private Cover cover;
    private Object currentModeRank;
    private int favouriteBeatmapsetCount;
    private int followerCount;
    private Object friends;
    private int graveyardBeatmapSetCount;
    private Group[] groups;
    private boolean isAdmin;
    private boolean isBng;
    private boolean isFullBn;
    private boolean isGmt;
    private boolean isLimitedBn;
    private boolean isModerator;
    private boolean isNat;
    private boolean isRestricted;
    private boolean isSilenced;
    private int lovedBeatmapsetCount;
    private UserMonthlyPlaycount[] monthlyPlaycounts;
    private Page page;
    private String[] previousUsernames;
    private int rankedAndApprovedBeatmapsetCount;
    private UserMonthlyReplaysWatchedCounts[] replaysWatchedCounts;
    private int scoresBestCount;
    private int scoreFirstCount;
    private int scoresRecentCount;
    private UserStatistics statistics;
    private int supportLevel;
    private int unrankedBeatmapsetCount;
    private int unreadPmCount;
    private UserAchievement[] userAchievements;
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
}
