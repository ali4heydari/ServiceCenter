package models.vehicles;

import models.vehicles.parts.GasEngine;
import models.vehicles.parts.Oil;

public abstract class AbstractCar extends WheelDriven {
    protected static final int WHEEL_COUNT = 4;
    protected static final int OIL_BASE_SPEED_FACTOR = 20;
    GasEngine gasEngine;



    {
        wheelCount = WHEEL_COUNT;
        WHEEL_BASE_SPEED_FACTOR = 30;

        parts
                .add(gasEngine);
        parts
                .stream()
                .filter(part -> part instanceof Oil)
                .forEach(oil -> oil.setBaseSpeedFactor(OIL_BASE_SPEED_FACTOR));
    }

}
