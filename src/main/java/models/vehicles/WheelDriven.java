package models.vehicles;

import models.vehicles.parts.Wheel;

import java.util.LinkedList;

public abstract class WheelDriven extends LandVehicle {
    protected static int wheelCount = 1;
    protected static int WHEEL_BASE_SPEED_FACTOR;
    protected static LinkedList<Wheel> wheels = new LinkedList<>();


    {

        parts
                .stream()
                .filter(part -> part instanceof Wheel)
                .forEach(wheel -> wheel.setBaseSpeedFactor(WHEEL_BASE_SPEED_FACTOR));
    }
}
