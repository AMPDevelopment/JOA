package JOA;

import com.ea.async.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

public class JOA {
    // Base
    private static final String base = "https://osu.ppy.sh/api/";

    // Version
    private static final String v1 = "v1";
    private static final String v2 = "v2";

    // Interfaces
    private static final String chat = "chat";
    private static final String channels = "channels";
    private static final String users = "users";
    private static final String comments = "comments";
    private static final String rooms = "rooms";
    private static final String notifications = "notifications";
    private static final String rankings = "rankings";
    private static final String spotlights = "spotlights";
    private static final String beatmaps = "beatmaps";
    private static final String beatmapsets = "beatmapsets";
    private static final String friends = "friends";
    private static final String news = "news";
    private static final String scores = "scores";
    private static final String seasonalBackgrounds = "seasonal-backgrounds";
    private static final String wiki = "wiki";
    private static final String changelog = "changelog";
    private static final String reports = "reports";
    private static final String me = "me";

    // Methods
    private static final String nouveau = "new";
    private static final String update = "update";
    private static final String markAsRead = "mark-as-read";
    private static final String markRead = "mark-read";
    private static final String vote = "vote";
    private static final String playlist = "playlist";
    private static final String events = "events";
    private static final String favourites = "favourites";
    private static final String presence = "presence";
    private static final String leaderboard = "leaderboard";
    private static final String download = "download";
    private static final String lookup = "lookup";
    private static final String search = "search";
    private static final String downloadQuotaCheck = "download-quota-check";
    private static final String kudosu = "kudosu";
    private static final String recentActivity = "recent_activity";


    // Parameters
    private static final String since = "since=";
    private static final String channelId = "channel_id=";
    private static final String messageId = "message_id=";
    private static final String limit = "limit=";
    private static final String offset = "offset=";
    private static final String includeFails = "include_fails=";
    private static final String mode = "mode=";
    private static final String until = "until=";
    private static final String commentableType = "commentable_type=";
    private static final String commentableId = "commentable_id=";
    private static final String commentMessage = "comment.message=";
    private static final String commentParentId = "comment.parent_id=";
    private static final String cursor = "cursor=";
    private static final String parentId = "parent_id=";
    private static final String sort = "sort=";
    private static final String maxId = "max_id=";
    private static final String spotlight = "spotlight=";

    private static String key;
    // Todo: Create a JOAConfiguration instead simply giving the key.

    public JOA(String key) {
        this.key = key;
        Async.init();
    }

    private static String getKey() {
        return key;
    }

    public static CompletableFuture<String> getAsync(String interfaceName, String methodName, String parameters) throws URISyntaxException {
        HttpClient client = HttpClient.newHttpClient();
        URI uri = new URI(base + v2 + "/" + interfaceName + "/" + methodName + "/?" + parameters);
        HttpRequest request = HttpRequest.newBuilder()
                .setHeader("Bearer", getKey())
                .uri(uri).build();
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::headers)
                .thenAccept(System.out::println)
                .join();

        // return string (awaitable)
        return null;
    }

    private class JOAException extends Exception {
        public JOAException(String message) throws Exception{

        }
    }
}
