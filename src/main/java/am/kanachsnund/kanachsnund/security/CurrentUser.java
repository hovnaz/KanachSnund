package am.kanachsnund.kanachsnund.security;

import am.kanachsnund.kanachsnund.model.User;
import org.springframework.security.core.authority.AuthorityUtils;

public class CurrentUser extends org.springframework.security.core.userdetails.User {

    private final User user;

    public CurrentUser(User user) {
        super(user.getEmail(), user.getPassword(), AuthorityUtils.createAuthorityList("ADMIN"));
        this.user = user;
    }
}
