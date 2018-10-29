package models.vehicles;

import models.FuelTank;

public abstract class AbstractCar extends WheelDriven {
    public static final int WHELL_COUNT = 4;
    FuelTank fuelTank;


    {
        wheelCount = WHELL_COUNT;
    }

}
