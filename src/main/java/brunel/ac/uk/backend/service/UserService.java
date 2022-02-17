package brunel.ac.uk.backend.service;

import brunel.ac.uk.backend.model.User;
import brunel.ac.uk.backend.web.dto.UserRegistrationDto;

public interface UserService {
    User save(UserRegistrationDto registrationDto);
}
