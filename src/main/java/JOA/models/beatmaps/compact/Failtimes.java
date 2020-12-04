package JOA.models.beatmaps.compact;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Failtimes {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty()
    private int[] exit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty()
    private int[] fail;

    public int[] getExit() {
        return exit;
    }

    public int[] getFail() {
        return fail;
    }
}
