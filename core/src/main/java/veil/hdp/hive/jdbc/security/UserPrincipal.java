package veil.hdp.hive.jdbc.security;

public class UserPrincipal {

    private final String user;
    private final String realm;

    public UserPrincipal(String user, String realm) {
        this.user = user;
        this.realm = realm;
    }

    public String getUser() {
        return user;
    }

    public String getRealm() {
        return realm;
    }
}