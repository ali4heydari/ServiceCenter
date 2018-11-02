package models.vehicles;

import enumerations.FuelType;
import models.vehicles.parts.AbstractPart;
import models.vehicles.parts.AbstractUpgradeablePart;

import java.util.LinkedList;

public abstract class Vehicle {
    int Id;
    String typeName;
    double maxHealth;
    double maxSpeed;
    double health;
    double baseSpeedFactor;
    FuelType fuelType;
    LinkedList<AbstractUpgradeablePart> parts;


    public void setMaxSpeed() {
        for (AbstractUpgradeablePart part :
                this.parts) {
            this.maxSpeed += part.getSpeedFactor();
        }
    }

    public double getBaseSpeedFactor() {
        return baseSpeedFactor;
    }

    public void setBaseSpeedFactor(double baseSpeedFactor) {
        this.baseSpeedFactor = baseSpeedFactor;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }
}
