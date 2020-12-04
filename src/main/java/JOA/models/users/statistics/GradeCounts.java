package JOA.models.users.statistics;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GradeCounts {
    @JsonProperty()
    private int a;

    @JsonProperty()
    private int s;

    @JsonProperty()
    private int sh;

    @JsonProperty()
    private int ss;

    @JsonProperty()
    private int ssh;

    public int getA() {
        return a;
    }

    public int getS() {
        return s;
    }

    public int getSh() {
        return sh;
    }

    public int getSs() {
        return ss;
    }

    public int getSsh() {
        return ssh;
    }
}
