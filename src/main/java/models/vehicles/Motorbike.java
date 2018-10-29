package models.vehicles;

import enumerations.FuelType;
import models.vehicles.parts.FuelTank;

public class Motorbike extends Bike {
    FuelTank fuelTank;

    {
        fuelType = FuelType.ELECTRICITY;
    }
}
