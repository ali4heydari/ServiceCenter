package models.vehicles;

import enumerations.FuelType;
import models.vehicles.parts.EngineBattery;
import models.vehicles.parts.FuelTank;

public class Motorbike extends Bike {
    EngineBattery engineBattery;

    {
        fuelType = FuelType.ELECTRICITY;
    }
}
