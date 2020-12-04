package JOA.models.chats.messages;

import JOA.models.users.compacts.UserCompact;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class ChatMessage {
    @JsonProperty("message_id")
    private int messageId;

    @JsonProperty("sender_id")
    private int authorId;

    @JsonProperty("channel_id")
    private int channelId;

    @JsonProperty()
    private Date timestamp;

    @JsonProperty()
    private String content;

    @JsonProperty("is_action")
    private boolean isAction;

    @JsonProperty("sender")
    private UserCompact author;

    public int getMessageId() {
        return messageId;
    }

    public int getAuthorId() {
        return authorId;
    }

    public int getChannelId() {
        return channelId;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getContent() {
        return content;
    }

    public boolean isAction() {
        return isAction;
    }

    public UserCompact getAuthor() {
        return author;
    }
}
