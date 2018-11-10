package models.vehicles.parts;

import interfaces.Changeable;
import interfaces.Deprecateable;

public class Wheel extends AbstractUpgradeablePart implements Changeable, Deprecateable {

    public void change() {

    }

    public void Upgrade() {

    }


    @Override
    public String toString() {
        return "Wheel{" +
                "speedFactor=" + speedFactor +
                ", level=" + level +
                ", maxHealth=" + maxHealth +
                ", health=" + health +
                ", baseSpeedFactor=" + baseSpeedFactor +
                '}';
    }

    public void deprecate(double distance) {

    }
}
