package lk.ijse.carRent.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class UserCredentialsDTO {
    private String username;
    private String password;
    private String role;
}
