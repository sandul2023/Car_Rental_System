package lk.ijse.carRent.entity;

import lk.ijse.carRent.embedded.CustomerImage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class Customer {
    @Id
    private String customerId;
    private String nic;
    private String name;
    private String email;
    private String address;
    private String contactNumber;
    private String licenceNo;

    @Embedded
    private CustomerImage uploadImages;

    @OneToOne(cascade = CascadeType.ALL)
    private UserCredentials userCredentials;
}
