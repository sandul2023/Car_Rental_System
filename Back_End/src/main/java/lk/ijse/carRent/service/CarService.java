package lk.ijse.carRent.service;

import lk.ijse.carRent.dto.CarDTO;
import lk.ijse.carRent.dto.ImageDTO;

import java.util.ArrayList;

public interface CarService {
    void saveCar(CarDTO carDTO);
    void updateCar(CarDTO carDTO);
    void deleteCar(String carId);
    ArrayList<CarDTO> getAllCars();
    ArrayList<CarDTO> getAllCarsSortFromBrand();
    ArrayList<CarDTO> getAllCarsFromCarType(String carType);
    void uploadCarImages(String carId, String frontImage, String backImage, String sideImage, String interiorImage);
    ImageDTO getCarImages(String carId);
    Long getCarCountByCarBrandAndAvailability(String carBrand, String availabilityType);
    CarDTO getCarFromCarId(String carID);
    int getAvailableCarCount();
    int getReservedCarCount();
    int getNeedToMaintenanceCarCount();
    int getUnderMaintenanceCarCount();
}
