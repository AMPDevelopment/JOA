package JOA.models.beatmapsets.compact;

public enum RankStatus {
    GRAVEYARD(-2),
    WIP(-1),
    PENDING(0),
    RANKED(1),
    APPROVED(2),
    QUALIFIED(3),
    LOVED(4);

    private final int value;

    RankStatus(final int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
