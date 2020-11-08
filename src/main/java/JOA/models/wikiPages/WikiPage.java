package JOA.models.wikiPages;

import org.jetbrains.annotations.Nullable;

public class WikiPage {
    private String layout;
    private String locale;
    private String markdown;
    private String path;

    @Nullable
    private String subtitle;
    private String[] tags;
    private String title;
}
