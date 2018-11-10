package models.vehicles;

import enumerations.FuelType;
import models.vehicles.parts.GasEngine;
import models.vehicles.parts.EngineBattery;

public class ElectricCar extends AbstractCar {
    private static final int ENGINE_BASE_SPEED_FACTOR = 80;
    private static final int FUEL_BASE_SPEED_FACTOR = 70; // Also called as EngineBattery in document
    EngineBattery engineBattery;


    {
        fuelType = FuelType.ELECTRICITY;
        parts
                .add(engineBattery);

        parts
                .stream()
                .filter(part -> part instanceof GasEngine)
                .forEach(engine -> engine.setBaseSpeedFactor(ENGINE_BASE_SPEED_FACTOR));

        parts
                .stream()
                .filter(part -> part instanceof EngineBattery)
                .forEach(engineBattery -> engineBattery.setBaseSpeedFactor(FUEL_BASE_SPEED_FACTOR));
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "engineBattery=" + engineBattery +
                ", gasEngine=" + gasEngine +
                ", Id=" + Id +
                ", maxHealth=" + maxHealth +
                ", maxSpeed=" + maxSpeed +
                ", health=" + health +
                ", baseSpeedFactor=" + baseSpeedFactor +
                '}';
    }
}
