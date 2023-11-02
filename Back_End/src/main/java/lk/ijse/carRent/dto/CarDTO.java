package lk.ijse.carRent.dto;

import lk.ijse.carRent.embedded.CarImage;
import lk.ijse.carRent.embedded.Mileage;
import lk.ijse.carRent.embedded.PriceRate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class CarDTO {
    private String carId;
    private String registerNum;
    private String brand;
    private String type;
    private PriceRate priceRate;
    private Mileage freeMileage;
    private String color;
    private String transmissionType;
    private int numOfPassengers;
    private String fuelType;
    private double pricePerExtraKM;
    private double lossDamageWaiver;
    private double lastServiceMileage;
    private CarImage availabilityType;
}
