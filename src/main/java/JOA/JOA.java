package JOA;

import com.ea.async.*;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JOA {
    // Base
    private static final String base = "https://osu.ppy.sh/api/";
    private static final String tokenUrl = "https://osu.ppy.sh/oauth/token/";

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

    private static JOAConfiguration joaConfiguration;
    private static String token;

    public JOA() {
        Async.init();
    }

    public JOA(JOAConfiguration joaConfiguration) {
        this.joaConfiguration = joaConfiguration;
        Async.init();
    }

    public void setJoaConfiguration(JOAConfiguration joaConfiguration) {
        this.joaConfiguration = joaConfiguration;
    }

    private static String getAsync(String interfaceName, String methodName, String parameters) throws Exception {
        if (joaConfiguration == null) {
            throw new JOAException("Missing configuration"); // Todo: Use exception property file in future
        }

        if (token == null) {
            token = getAccessToken();
        }

        HttpClient client = new DefaultHttpClient();
        HttpPost post = new HttpPost(base + v2 + "/" + interfaceName + "/" + methodName + "/?" + parameters);
        post.addHeader("Authorization", "Bearer " + token);

        HttpResponse response = client.execute(post);
        return EntityUtils.toString(response.getEntity());
    }

    private static String getAccessToken() throws IOException {
        HttpClient client = new DefaultHttpClient();
        HttpPost post = new HttpPost(tokenUrl);

        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("client_id", Integer.toString(joaConfiguration.getClientId())));
        params.add(new BasicNameValuePair("client_secret", joaConfiguration.getClientSecret()));
        params.add(new BasicNameValuePair("grant_type", "client_credentials"));
        params.add(new BasicNameValuePair("scope", "public"));

        post.setEntity(new UrlEncodedFormEntity(params));
        HttpResponse response = client.execute(post);
        String body = EntityUtils.toString(response.getEntity());
        return body;
    }

    private static class JOAException extends Exception {
        public JOAException(String message) throws Exception{

        }
    }
}
