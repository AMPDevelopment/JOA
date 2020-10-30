package JOA.models.spotlights;

import org.jetbrains.annotations.Nullable;

import java.util.Date;

public class Spotlight {
    private Date endDate;
    private int id;
    private boolean modeSpecific;

    @Nullable
    private int participantCount;
    private String name;
    private Date startDate;
    private String type;
}
