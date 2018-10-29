package models.vehicles;

import enumerations.FuelType;
import models.vehicles.parts.FuelTank;

public class Motorcycle extends Bike {
    FuelTank fuelTank;

    {
        fuelType = FuelType.GAS;
    }
}
