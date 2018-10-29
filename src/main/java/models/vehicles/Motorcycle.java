package models.vehicles;

import enumerations.FuelType;
import models.FuelTank;

public class Motorcycle extends Bike {
    FuelTank fuelTank;

    {
        fuelType = FuelType.GAS;
    }
}
