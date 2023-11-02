package lk.ijse.carRent.embedded;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Embeddable;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Embeddable
public class CustomerImage {
    private String nicImage;
    private String licenseImage;
}
