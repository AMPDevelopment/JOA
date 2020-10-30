package JOA.models.chats.channels;

import JOA.models.chats.messages.ChatMessage;
import org.jetbrains.annotations.Nullable;

public class ChatChannel {
    private int channelId;
    private String name;

    @Nullable
    private String description;
    private String icon;
    private String type;

    @Nullable
    private int firstMessageId;

    @Nullable
    private int lastReadId;

    @Nullable
    private int lastMessageId;

    @Nullable
    private ChatMessage[] recentMessages;
    private boolean moderated;

    @Nullable
    private int[] users;
}
