package JOA.models.chats.channels;

import JOA.models.chats.messages.ChatMessage;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ChatChannel {
    @JsonProperty("channel_id")
    private int channelId;

    @JsonProperty()
    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty()
    private String description;

    @JsonProperty()
    private String icon;

    @JsonProperty()
    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("first_message_id")
    private int firstMessageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("last_read_id")
    private int lastReadId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("last_message_id")
    private int lastMessageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("recent_messages")
    private ChatMessage[] recentMessages;

    @JsonProperty()
    private boolean moderated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty()
    private int[] users;
}
