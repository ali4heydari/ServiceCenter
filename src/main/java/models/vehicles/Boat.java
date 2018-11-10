package models.vehicles;

import enumerations.FuelType;
import models.vehicles.parts.GasEngine;
import models.vehicles.parts.FuelTank;
import models.vehicles.parts.Oil;

public class Boat extends WateryVehicle {
    private static final int ENGINE_BASE_SPEED_FACTOR = 30;
    private static final int FUEL_BASE_SPEED_FACTOR = 20;
    private static final int OIL_BASE_SPEED_FACTOR = 20;

    {
        fuelType = FuelType.GAS;
        parts
                .stream()
                .filter(part -> part instanceof GasEngine)
                .forEach(engine -> engine.setBaseSpeedFactor(ENGINE_BASE_SPEED_FACTOR));
        parts
                .stream()
                .filter(part -> part instanceof FuelTank)
                .forEach(fuelTank -> fuelTank.setBaseSpeedFactor(FUEL_BASE_SPEED_FACTOR));

        parts
                .stream()
                .filter(part -> part instanceof Oil)
                .forEach(oil -> oil.setBaseSpeedFactor(OIL_BASE_SPEED_FACTOR));
    }
}
