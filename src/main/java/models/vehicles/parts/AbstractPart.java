package models.vehicles.parts;

import enumerations.FuelType;
import models.vehicles.Car;
import models.vehicles.Vehicle;

public abstract class AbstractPart {
    double maxHealth;
    double health;
    int baseSpeedFactor;


    public double getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(double maxHealth) {
        this.maxHealth = maxHealth;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public int getBaseSpeedFactor() {
        return baseSpeedFactor;
    }

    public void setBaseSpeedFactor(int baseSpeedFactor) {
        this.baseSpeedFactor = baseSpeedFactor;
    }


}
