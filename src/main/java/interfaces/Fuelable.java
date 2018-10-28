package interfaces;

import enumerations.FuelType;

public interface Fuelable {
    FuelType fuelType = FuelType.Gas;
    float capacity = -1;
    float consume = -1;

}
