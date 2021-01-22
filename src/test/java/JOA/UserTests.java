package JOA;

import static org.assertj.core.api.Assertions.*;

import JOA.models.users.User;
import org.junit.jupiter.api.Test;

public class UserTests {

    @Test
    public void loginWithCredentials() throws Exception {
        int id = 1234;
        String secret = "secret";
        JOAConfiguration joaConfiguration = new JOAConfiguration(id, secret);
        JOA joa = new JOA(joaConfiguration);

        User user = joa.getUser(7801119);
        assertThat(user.getUsername()).isEqualTo("OnlyOneCookie");
    }
}
