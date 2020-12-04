package JOA.models.events;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Event {
    @JsonProperty("created_at")
    private Date createdAt;

    @JsonProperty
    private int id;

    @JsonProperty("type")
    private EventType eventType;

    @JsonProperty
    private Beatmap beatmap;

    @JsonProperty
    private Beatmapset beatmapset;

    @JsonProperty
    private User user;

    public Date getCreatedAt() {
        return createdAt;
    }

    public int getId() {
        return id;
    }

    public EventType getEventType() {
        return eventType;
    }

    public Beatmap getBeatmap() {
        return beatmap;
    }

    public Beatmapset getBeatmapset() {
        return beatmapset;
    }

    public User getUser() {
        return user;
    }
}
