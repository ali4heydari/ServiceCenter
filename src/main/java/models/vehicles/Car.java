package models.vehicles;
import enumerations.FuelType;
import models.vehicles.parts.GasEngine;
import models.vehicles.parts.FuelTank;

public class Car extends AbstractCar {
    private static final int FUEL_BASE_SPEED_FACTOR = 40;
    private static final int ENGINE_BASE_SPEED_FACTOR = 100;
    FuelTank fuelTank;

    {

        fuelType = FuelType.GAS;

        parts
                .add(fuelTank);
        parts
                .stream()
                .filter(part -> part instanceof GasEngine)
                .forEach(wheel -> wheel.setBaseSpeedFactor(ENGINE_BASE_SPEED_FACTOR));
        parts
                .stream()
                .filter(part -> part instanceof FuelTank)
                .forEach(fuelTank -> fuelTank.setBaseSpeedFactor(FUEL_BASE_SPEED_FACTOR));

    }


    @Override
    public String toString() {
        return "Car{" +
                "fuelTank=" + fuelTank +
                ", gasEngine=" + gasEngine +
                ", Id=" + Id +
                ", maxHealth=" + maxHealth +
                ", maxSpeed=" + maxSpeed +
                ", health=" + health +
                ", baseSpeedFactor=" + baseSpeedFactor +
                '}';
    }
}
