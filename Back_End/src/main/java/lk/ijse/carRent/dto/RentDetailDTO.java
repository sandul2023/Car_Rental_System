package lk.ijse.carRent.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class RentDetailDTO {
    private String rentId;
    private String carId;
    private double distanceMileage;
    private double carCost;
    private double driverCost;
    private double damageFee;
    private DriverDTO driver;
}
