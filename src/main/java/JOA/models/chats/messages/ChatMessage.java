package JOA.models.chats.messages;

import JOA.models.users.compacts.UserCompact;

public class ChatMessage {
    private int messageId;
    private int senderId;
    private int channelId;
    private String timestamp;
    private String content;
    private boolean isAction;
    private UserCompact sender;
}
