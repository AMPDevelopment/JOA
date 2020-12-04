package JOA.models.beatmapsets.compact;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Covers {
    @JsonProperty()
    private String cover;

    @JsonProperty("cover@2x")
    private String cover2x;

    @JsonProperty()
    private String card;

    @JsonProperty("card@2x")
    private String card2x;

    @JsonProperty()
    private String list;

    @JsonProperty("list@2x")
    private String list2x;

    @JsonProperty()
    private String slimcover;

    @JsonProperty("slimcover@2x")
    private String slimcover2x;

    public String getCover() {
        return cover;
    }

    public String getCover2x() {
        return cover2x;
    }

    public String getCard() {
        return card;
    }

    public String getCard2x() {
        return card2x;
    }

    public String getList() {
        return list;
    }

    public String getList2x() {
        return list2x;
    }

    public String getSlimcover() {
        return slimcover;
    }

    public String getSlimcover2x() {
        return slimcover2x;
    }
}
