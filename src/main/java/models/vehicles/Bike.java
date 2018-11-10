package models.vehicles;

import enumerations.FuelType;
import models.vehicles.parts.Wheel;

public class Bike extends WheelDriven {
    private static final int WHEEL_COUNT = 2;


    {
        WHEEL_BASE_SPEED_FACTOR = 10;
        wheelCount = WHEEL_COUNT;
        fuelType = FuelType.NONE;

        for (int i = 0; i < WHEEL_COUNT; i++) {
            wheels.add(new Wheel());
        }

        parts
                .addAll(wheels);


    }

    @Override
    public String toString() {
        return "Bike{" +
                "Id=" + Id +
                ", maxHealth=" + maxHealth +
                ", maxSpeed=" + maxSpeed +
                ", health=" + health +
                ", baseSpeedFactor=" + baseSpeedFactor +
                ", wheelsCount=" + WHEEL_COUNT +
                ", wheels=" + wheels.toString() +
                ", FuelType=" + fuelType.name() +
                '}';
    }
}
