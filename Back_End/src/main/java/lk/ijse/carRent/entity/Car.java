package lk.ijse.carRent.entity;

import lk.ijse.carRent.embedded.CarImage;
import lk.ijse.carRent.embedded.Mileage;
import lk.ijse.carRent.embedded.PriceRate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class Car {
    @Id
    private String carId;

    private String registerNum;
    private String brand;
    private String type;

    @Embedded
    private PriceRate priceRate;

    @Embedded
    private Mileage freeMileage;

    private String color;
    private String transmissionType;
    private int numOfPassengers;
    private String fuelType;
    private double pricePerExtraKM;
    private double lossDamageWaiver;
    private double lastServiceMileage;

    @Embedded
    private CarImage availabilityType;

}
