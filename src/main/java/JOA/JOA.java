package JOA;

import JOA.models.users.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;

import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class JOA {
    // Base
    private static final String BASE = "https://osu.ppy.sh/api/";
    private static final String AUTH_URL = "https://osu.ppy.sh/oauth/authorize/";
    private static final String TOKEN_URL = "https://osu.ppy.sh/oauth/token/";

    // Version
    private static final String V1 = "v1";
    private static final String V2 = "v2";

    // Interfaces
    private static final String CHAT = "chat";
    private static final String CHANNELS = "channels";
    private static final String USERS = "users";
    private static final String COMMENTS = "comments";
    private static final String ROOMS = "rooms";
    private static final String NOTIFICATIONS = "notifications";
    private static final String RANKINGS = "rankings";
    private static final String SPOTLIGHTS = "spotlights";
    private static final String BEATMAPS = "beatmaps";
    private static final String BEATMAPSETS = "beatmapsets";
    private static final String FRIENDS = "friends";
    private static final String NEWS = "news";
    private static final String SCORES = "scores";
    private static final String SEASONAL_BACKGROUNDS = "seasonal-backgrounds";
    private static final String WIKI = "wiki";
    private static final String CHANGELOG = "changelog";
    private static final String REPORTS = "reports";
    private static final String ME = "me";

    // Methods
    private static final String NOUVEAU = "new";
    private static final String UPDATE = "update";
    private static final String MARK_AS_READ = "mark-as-read";
    private static final String MARK_READ = "mark-read";
    private static final String VOTE = "vote";
    private static final String PLAYLIST = "playlist";
    private static final String EVENTS = "events";
    private static final String FAVOURITES = "favourites";
    private static final String PRESENCE = "presence";
    private static final String LEADERBOARD = "leaderboard";
    private static final String DOWNLOAD = "download";
    private static final String LOOKUP = "lookup";
    private static final String SEARCH = "search";
    private static final String DOWNLOAD_QUOTA_CHECK = "download-quota-check";
    private static final String KUDOSU = "kudosu";
    private static final String RECENT_ACTIVITY = "recent_activity";


    // Parameters
    private static final String SINCE = "since=";
    private static final String CHANNEL_ID = "channel_id=";
    private static final String MESSAGE_ID = "message_id=";
    private static final String LIMIT = "limit=";
    private static final String OFFSET = "offset=";
    private static final String INCLUDE_FAILS = "include_fails=";
    private static final String MODE = "mode=";
    private static final String UNTIL = "until=";
    private static final String COMMENTABLE_TYPE = "commentable_type=";
    private static final String COMMENTABLE_ID = "commentable_id=";
    private static final String COMMENT_MESSAGE = "comment.message=";
    private static final String COMMENT_PARENT_ID = "comment.parent_id=";
    private static final String CURSOR = "cursor=";
    private static final String PARENT_ID = "parent_id=";
    private static final String SORT = "sort=";
    private static final String MAX_ID = "max_id=";
    private static final String SPOTLIGHT = "spotlight=";

    private static JOAConfiguration joaConfiguration;
    private static String token;

    public JOA() {
    }

    public JOA(JOAConfiguration joaConfiguration) {
        this.joaConfiguration = joaConfiguration;
    }

    public void setJoaConfiguration(JOAConfiguration joaConfiguration) {
        this.joaConfiguration = joaConfiguration;
    }

    public User getUserById(int id) throws Exception {
        String result = getAsync(USERS, Integer.toString(id));
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(result, User.class);
    }

    private static String getAsync(String interfaceName, String methodName, String parameters) throws Exception {
        return getAsyncBase(BASE + V2 + "/" + interfaceName + "/" + methodName + "/" + parameters);
    }

    private static String getAsync(String interfaceName, String parameters) throws Exception {
        return getAsyncBase(BASE + V2 + "/" + interfaceName + "/" + parameters);
    }

    private static String getAsyncBase(String url) throws Exception {
        if (joaConfiguration == null) {
            throw new JOAException("Missing configuration"); // Todo: Use exception property file in future
        }

        if (token == null) {
            token = getAppAccessToken();
        }

        HttpClient client = new DefaultHttpClient();
        HttpPost post = new HttpPost(url);
        post.addHeader("Authorization", "Bearer " + token);

        HttpResponse response = client.execute(post);
        return new BufferedReader(new InputStreamReader(response.getEntity().getContent())).toString();
    }

    private static String getAppAccessToken() throws IOException {
        HttpClient client = new DefaultHttpClient();
        HttpPost post = new HttpPost(TOKEN_URL);
        post.addHeader("Content-Type", "application/json");

        List<NameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair("client_id", Integer.toString(joaConfiguration.getClientId())));
        params.add(new BasicNameValuePair("client_secret", joaConfiguration.getClientSecret()));
        params.add(new BasicNameValuePair("grant_type", "client_credentials"));
        params.add(new BasicNameValuePair("scope", "public"));
        post.setEntity(new UrlEncodedFormEntity(params));

        HttpResponse response = client.execute(post);
        BufferedReader reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
        ObjectMapper mapper = new ObjectMapper();
        CredentialsGrant credentialsGrant = mapper.readValue(reader.toString(), CredentialsGrant.class);
        return credentialsGrant.getAccessToken();
    }

    private static class JOAException extends Exception {
        public JOAException(String message) throws Exception {
            throw new Exception(message);
        }
    }
}
