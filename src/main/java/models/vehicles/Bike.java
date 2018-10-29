package models.vehicles;

import enumerations.FuelType;

public class Bike extends WheelDriven {
    private static final int WHEEL_COUNT = 2;



    {
        wheelCount = WHEEL_COUNT;
        fuelType = FuelType.NONE;
    }
}
