package JOA.models.users;

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
    private Timestamp lastVisit;
    private boolean pmFriendsOnly;
    private String profileColor;
    private String username;
    private UserAccountHistory[] userAccountHistories;
    

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

    public Timestamp getLastVisit() {
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
