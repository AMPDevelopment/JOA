package JOA.models.kudosus;

import org.jetbrains.annotations.Nullable;

import java.sql.Timestamp;

public class KudosuHistory {
    private int id;
    private KudosuAction action;
    private int amount;
    private String model;
    private String createdAt; // Timestamp

    @Nullable
    private Giver giver;
    private Post post;
}
