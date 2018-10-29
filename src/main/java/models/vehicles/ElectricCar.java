package models.vehicles;

import enumerations.FuelType;
import models.FuelTank;

public class ElectricCar extends AbstractCar {
    FuelTank fuelTank;

    {
        fuelType = FuelType.ELECTRICITY;
    }
}
