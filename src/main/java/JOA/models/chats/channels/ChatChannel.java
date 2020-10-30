package JOA.models.chats.channels;

import JOA.models.chats.messages.ChatMessage;

public class ChatChannel {
    private int channelId;
    private String name;
    private String description;
    private String icon;
    private String type;
    private int firstMessageId;
    private int lastReadId;
    private ChatMessage[] recentMessages;
    private boolean moderated;
    private int[] users;
}
