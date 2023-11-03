package lk.ijse.carRent.embedded;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Embeddable;
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Name {
    String firstName;
    String lastName;
}
