package lk.ijse.carRent.repo;

import lk.ijse.carRent.entity.UserCredentials;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCredentialsRepo extends JpaRepository<UserCredentials, String> {
    Boolean existsByUsername(String username);
    UserCredentials findUserCredentialsByUsername(String username);
    UserCredentials findUsernameAndPassword(String username, String password);
}
