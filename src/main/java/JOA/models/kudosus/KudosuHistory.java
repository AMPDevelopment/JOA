package JOA.models.kudosus;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class KudosuHistory {
    @JsonProperty()
    private int id;

    @JsonProperty()
    private KudosuAction action;

    @JsonProperty()
    private int amount;

    @JsonProperty()
    private String model;

    @JsonProperty("created_at")
    private Date createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty()
    private Giver giver;

    @JsonProperty()
    private Post post;

    public int getId() {
        return id;
    }

    public KudosuAction getAction() {
        return action;
    }

    public int getAmount() {
        return amount;
    }

    public String getModel() {
        return model;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Giver getGiver() {
        return giver;
    }

    public Post getPost() {
        return post;
    }
}
