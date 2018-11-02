package models.vehicles.parts;

import interfaces.Upgradeable;

public abstract class AbstractUpgradeablePart extends AbstractPart implements Upgradeable {
    public static final double PART_LEVEL_BASE = 1.1;
    double speedFactor;
    int level;


    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getSpeedFactor() {
        return speedFactor;
    }

    protected void setPartSpeedFactor() {
        this.speedFactor = this.baseSpeedFactor * Math.pow(PART_LEVEL_BASE, this.level) * (this.health / this.maxHealth);
    }


}
