package models.vehicles;

import enumerations.FuelType;
import models.vehicles.parts.GasEngine;
import models.vehicles.parts.EngineBattery;

public class Motorbike extends Bike {
    private static final int FUEL_BASE_SPEED_FACTOR = 15;
    private static final int ENGINE_BASE_SPEED_FACTOR = 20;
    EngineBattery engineBattery;

    {
        fuelType = FuelType.ELECTRICITY;

        parts
                .stream()
                .filter(part -> part instanceof EngineBattery)
                .forEach(engineBattery -> engineBattery.setBaseSpeedFactor(FUEL_BASE_SPEED_FACTOR));
        parts
                .stream()
                .filter(part -> part instanceof GasEngine)
                .forEach(engine -> engine.setBaseSpeedFactor(ENGINE_BASE_SPEED_FACTOR));

    }
}
