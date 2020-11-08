package JOA;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CredentialsGrant {
    @JsonProperty("token_type")
    private String tokenType;

    @JsonProperty("expires_in")
    private int expiresIn;

    @JsonProperty("access_token")
    private String accessToken;

    public String getTokenType() {
        return this.tokenType;
    }

    public int getExpiresIn() {
        return this.expiresIn;
    }

    public String getAccessToken() {
        return this.accessToken;
    }
}
