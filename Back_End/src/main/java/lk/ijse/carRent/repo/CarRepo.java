package lk.ijse.carRent.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.ArrayList;

public interface CarRepo extends JpaRepository<Car, String> {
    @Modifying
    @Transactional
    @Query(value = "UPDATE Car SET front=:front,back=:back,side=:side,interior=:interior WHERE carId=:carId", nativeQuery = true)
    void uploadCarImages(@Param("carId") String carId, @Param("front") String front, @Param("back") String back, @Param("side") String side, @Param("interior") String interior);

    @Query(nativeQuery = true, value = "SELECT * FROM Car GROUP BY brand")
    ArrayList<Car> getAllCarsSortFromBrand();

    @Query(nativeQuery = true, value = "SELECT * FROM Car WHERE type=:type GROUP BY brand")
    ArrayList<Car> getAllCarsFromCarType(@Param("type")String carType);

    Long countCarByBrandAndAvailabilityType(String brand, String availabilityType);

    Car findCarByCarId(String carId);

    @Query(nativeQuery = true, value = "SELECT COUNT(carId) FROM Car WHERE availabilityType='Unavailable'")
    int getReservedCarCount();

    @Query(nativeQuery = true, value = "SELECT COUNT(carId) FROM Car WHERE availabilityType='Need Maintenance'")
    int getNeedToMaintenanceCarCount();

    @Query(nativeQuery = true, value = "SELECT COUNT(carId) FROM Car WHERE availabilityType='Under Maintenance'")
    int getUnderMaintenanceCarCount();
}
