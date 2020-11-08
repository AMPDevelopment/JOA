package JOA.models.chats.messages;

import JOA.models.users.compacts.UserCompact;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ChatMessage {
    @JsonProperty("message_id")
    private int messageId;

    @JsonProperty("sender_id")
    private int authorId;

    @JsonProperty("channel_id")
    private int channelId;

    @JsonProperty()
    private String timestamp; // Timestamp

    @JsonProperty()
    private String content;

    @JsonProperty("is_action")
    private boolean isAction;

    @JsonProperty("sender")
    private UserCompact author;
}
