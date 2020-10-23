package JOA;

public class JOA {
    // Base
    private final String base = "https://osu.ppy.sh/api/";

    // Version
    private final String v1 = "v1";
    private final String v2 = "v2";

    // Interfaces
    private final String chat = "chat";
    private final String channels = "channels";
    private final String users = "users";
    private final String comments = "comments";
    private final String rooms = "rooms";
    private final String notifications = "notifications";
    private final String rankings = "rankings";
    private final String spotlights = "spotlights";
    private final String beatmaps = "beatmaps";
    private final String beatmapsets = "beatmapsets";
    private final String friends = "friends";
    private final String news = "news";
    private final String scores = "scores";
    private final String seasonalBackgrounds = "seasonal-backgrounds";
    private final String wiki = "wiki";
    private final String changelog = "changelog";
    private final String reports = "reports";
    private final String me = "me";

    // Methods
    private final String nouveau = "new";
    private final String update = "update";
    private final String markAsRead = "mark-as-read";
    private final String markRead = "mark-read";
    private final String vote = "vote";
    private final String playlist = "playlist";
    private final String events = "events";
    private final String favourites = "favourites";
    private final String presence = "presence";
    private final String leaderboard = "leaderboard";
    private final String download = "download";
    private final String lookup = "lookup";
    private final String search = "search";
    private final String downloadQuotaCheck = "download-quota-check";
    private final String kudosu = "kudosu";
    private final String recentActivity = "recent_activity";


    // Parameters
    private final String since = "since=";
    private final String channelId = "channel_id=";
    private final String messageId = "message_id=";
    private final String limit = "limit=";
    private final String offset = "offset=";
    private final String includeFails = "include_fails=";
    private final String mode = "mode=";
    private final String until = "until=";
    private final String commentableType = "commentable_type=";
    private final String commentableId = "commentable_id=";
    private final String commentMessage = "comment.message=";
    private final String commentParentId = "comment.parent_id=";
    private final String cursor = "cursor=";
    private final String parentId = "parent_id=";
    private final String sort = "sort=";
    private final String maxId = "max_id=";
    private final String spotlight = "spotlight=";

    private String key;

    // Todo: Enum for modes


    public JOA(String key) {
        this.key = key;
    }

    private String getKey() {
        return this.key;
    }

    public String getAsync(String interfaceName, String methodName, String parameters) {

    }

    private class JOAException extends Exception {
        public JOAException(String message) throws Exception{

        }
    }
}
