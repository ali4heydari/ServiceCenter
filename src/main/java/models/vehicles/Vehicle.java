package models.vehicles;

import enumerations.FuelType;
import models.vehicles.parts.AbstractPart;
import models.vehicles.parts.AbstractUpgradeablePart;

import java.util.Arrays;
import java.util.LinkedList;

public abstract class Vehicle {
    protected int Id;
    protected static String typeName;
    protected double totalPassedDistance;
    protected double maxHealth;
    protected double maxSpeed;
    protected double health;
    protected double baseSpeedFactor;
    protected static FuelType fuelType;
    protected static LinkedList<AbstractPart> parts = new LinkedList<>();


    public void setMaxSpeed() {
        for (AbstractPart part :
                parts) {
            if (part instanceof AbstractUpgradeablePart) {
                AbstractUpgradeablePart abstractUpgradeablePart = (AbstractUpgradeablePart) part;
                this.maxSpeed += abstractUpgradeablePart.getSpeedFactor();
            }

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

    public static void addParts(AbstractPart... abstractParts){
        parts.addAll(Arrays.asList(abstractParts));
    }
}
