# JOA

## Getting started
```Java
import JOA;
import JOA.models.users.User;

...

    int clientId = 1337;
    String clientSecret = "secret1337";

    JOA joa = new JOA(new JOAConfiguration(clientId, clientSecret));
    User user = joa.getUserById(1);
    System.out.println(user.getUsername());
```
