package JOA.models.users;

import JOA.models.modes.GameMode;
import JOA.models.users.compacts.UserCompact;
import org.jetbrains.annotations.Nullable;

public class User extends UserCompact {
    private String coverUrl;

    @Nullable
    private String discord;
    private boolean hasSupported;

    @Nullable
    private String interests;
    private Kudosu kudosu;
    private String lastFm;

    @Nullable
    private String location;
    private int maxBlocks;
    private int maxFriends;

    @Nullable
    private String occupation;
    private GameMode playmode;
    private String[] playstyle;
    private int postCount;
    private String[] profileOrder;

    @Nullable
    private String skype;

    @Nullable
    private String title;

    @Nullable
    private String twitter;

    @Nullable
    private String website;
}
