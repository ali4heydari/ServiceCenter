package models.vehicles;
import enumerations.FuelType;
import models.vehicles.parts.Engine;
import models.vehicles.parts.FuelTank;
import models.vehicles.parts.Wheel;

public class Car extends AbstractCar {
    private static final int FUEL_BASE_SPEED_FACTOR = 40;
    private static final int ENGINE_BASE_SPEED_FACTOR = 100;

    private static void initialPartsBaseSpeedFactor(){

    }

    {

        fuelType = FuelType.GAS;
        this.parts
                .stream()
                .filter(part -> part instanceof Engine)
                .forEach(wheel -> wheel.setBaseSpeedFactor(ENGINE_BASE_SPEED_FACTOR));
        this.parts
                .stream()
                .filter(part -> part instanceof FuelTank)
                .forEach(fuelTank -> fuelTank.setBaseSpeedFactor(FUEL_BASE_SPEED_FACTOR));

    }


}
