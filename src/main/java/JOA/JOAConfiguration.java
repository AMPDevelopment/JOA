package JOA;

public class JOAConfiguration {
    private int clientId;
    private String clientSecret;

    public JOAConfiguration(int clientId, String clientSecret) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    public int getClientId() {
        return this.clientId;
    }

    public String getClientSecret() {
        return this.clientSecret;
    }
}
