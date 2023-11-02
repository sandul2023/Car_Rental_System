package lk.ijse.carRent.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class AdminDTO {
    private String adminNic;
    private String adminName;
    private String contactNumber;
    private String email;
    private UserCredentialsDTO userCredentials;
}
