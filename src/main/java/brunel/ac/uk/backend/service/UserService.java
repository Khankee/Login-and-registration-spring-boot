package brunel.ac.uk.backend.service;

import brunel.ac.uk.backend.model.User;
import brunel.ac.uk.backend.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService{
    User save(UserRegistrationDto registrationDto);
}
