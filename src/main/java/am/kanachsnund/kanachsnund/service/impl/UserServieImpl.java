package am.kanachsnund.kanachsnund.service.impl;

import am.kanachsnund.kanachsnund.model.Role;
import am.kanachsnund.kanachsnund.model.User;
import am.kanachsnund.kanachsnund.repository.UserRepository;
import am.kanachsnund.kanachsnund.service.UserService;
import com.sun.jdi.request.DuplicateRequestException;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServieImpl implements UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    @Override
    public User save(User user) {
        if(userRepository.findByEmail(user.getEmail()).isPresent()){
            throw  new DuplicateRequestException("User already exists.");
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole(Role.ADMIN);
        userRepository.save(user);
        return user;
    }
}
