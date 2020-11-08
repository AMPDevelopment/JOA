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
}
