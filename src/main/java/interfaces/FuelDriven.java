package interfaces;

import enumerations.FuelType;
import models.FuelTank;

public interface FuelDriven {
    FuelType fuelType = FuelType.NONE;
    FuelTank fuelTank = new FuelTank();
    float consume = -1;

}
