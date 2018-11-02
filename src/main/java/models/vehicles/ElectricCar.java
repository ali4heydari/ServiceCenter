package models.vehicles;

import enumerations.FuelType;
import models.vehicles.parts.Engine;
import models.vehicles.parts.EngineBattery;
import models.vehicles.parts.FuelTank;

public class ElectricCar extends AbstractCar {
    public static final int ENGINE_BASE_SPEED_FACTOR = 80;
    public static final int FUEL_BASE_SPEED_FACTOR = 70; // Also called as EngineBattery in document
    EngineBattery engineBattery;


    {
        fuelType = FuelType.ELECTRICITY;
        this.parts
                .stream()
                .filter(part -> part instanceof Engine)
                .forEach(engine -> engine.setBaseSpeedFactor(ENGINE_BASE_SPEED_FACTOR));

        this.parts
                .stream()
                .filter(part -> part instanceof EngineBattery)
                .forEach(engineBattery -> engineBattery.setBaseSpeedFactor(FUEL_BASE_SPEED_FACTOR));
    }
}
