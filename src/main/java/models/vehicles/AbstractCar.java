package models.vehicles;

import models.vehicles.parts.FuelTank;
import models.vehicles.parts.Oil;
import models.vehicles.parts.Wheel;

public abstract class AbstractCar extends WheelDriven {
    protected static final int WHEEL_COUNT = 4;
    protected static final int WHEEL_BASE_SPEED_FACTOR = 30;
    protected static final int OIL_BASE_SPEED_FACTOR = 20;
    FuelTank fuelTank;


    {
        wheelCount = WHEEL_COUNT;
        this.parts
                .stream()
                .filter(part -> part instanceof Wheel)
                .forEach(wheel -> wheel.setBaseSpeedFactor(WHEEL_BASE_SPEED_FACTOR));

        this.parts
                .stream()
                .filter(part -> part instanceof Oil)
                .forEach(oil -> oil.setBaseSpeedFactor(OIL_BASE_SPEED_FACTOR));
    }

}
