package am.kanachsnund.kanachsnund.security;

import am.kanachsnund.kanachsnund.Exception.UserNotFoundException;
import am.kanachsnund.kanachsnund.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDetailServiceImpl implements UserDetailsService {

    private final PasswordEncoder passwordEncoder;
    @Value("${project.username}")
    private String username;
    @Value("${project.password}")
    private String password;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if(!this.username.equals(username)){
            throw new UserNotFoundException("User not found");
        }
        return new CurrentUser(new User(this.username, passwordEncoder.encode(password)));
    }
}
