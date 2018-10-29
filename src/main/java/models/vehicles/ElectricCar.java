package models.vehicles;

import enumerations.FuelType;
import models.vehicles.parts.EngineBattery;
import models.vehicles.parts.FuelTank;

public class ElectricCar extends AbstractCar {
    EngineBattery engineBattery;


    {
        fuelType = FuelType.ELECTRICITY;
    }
}
