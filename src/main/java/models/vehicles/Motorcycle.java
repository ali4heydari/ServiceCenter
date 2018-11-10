package models.vehicles;

import enumerations.FuelType;
import models.vehicles.parts.GasEngine;
import models.vehicles.parts.FuelTank;
import models.vehicles.parts.Oil;

public class Motorcycle extends Bike {
    private static final int OIL_BASE_SPEED_FACTOR = 20;
    private static final int FUEL_BASE_SPEED_FACTOR = 15;
    private static final int ENGINE_BASE_SPEED_FACTOR = 80;
    FuelTank fuelTank;

    {
        fuelType = FuelType.GAS;
        //TODO check this
        WHEEL_BASE_SPEED_FACTOR = 20;

        parts
                .stream()
                .filter(part -> part instanceof Oil)
                .forEach(oil -> oil.setBaseSpeedFactor(OIL_BASE_SPEED_FACTOR));

        parts
                .stream()
                .filter(part -> part instanceof FuelTank)
                .forEach(fuelTank -> fuelTank.setBaseSpeedFactor(FUEL_BASE_SPEED_FACTOR));
        parts
                .stream()
                .filter(part -> part instanceof GasEngine)
                .forEach(engine -> engine.setBaseSpeedFactor(ENGINE_BASE_SPEED_FACTOR));

    }
}
