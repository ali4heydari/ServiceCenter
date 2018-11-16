package models.vehicles.parts.settings;

public abstract class UpgradeablePartSetting {
    public Double healthDecrease;
    public Integer maxHealthUpgradeIncrease;
    public Integer basePriceFactor;
    public Integer baseDuration;

    @Override
    public String toString() {
        return "UpgradeablePartSetting{" +
                "healthDecrease=" + healthDecrease +
                ", maxHealthUpgradeIncrease=" + maxHealthUpgradeIncrease +
                ", basePriceFactor=" + basePriceFactor +
                ", baseDuration=" + baseDuration +
                '}';
    }

    public Double getHealthDecrease() {
        return healthDecrease;
    }

    public void setHealthDecrease(Double healthDecrease) {
        this.healthDecrease = healthDecrease;
    }

    public Integer getMaxHealthUpgradeIncrease() {
        return maxHealthUpgradeIncrease;
    }

    public void setMaxHealthUpgradeIncrease(Integer maxHealthUpgradeIncrease) {
        this.maxHealthUpgradeIncrease = maxHealthUpgradeIncrease;
    }

    public Integer getBasePriceFactor() {
        return basePriceFactor;
    }

    public void setBasePriceFactor(Integer basePriceFactor) {
        this.basePriceFactor = basePriceFactor;
    }

    public Integer getBaseDuration() {
        return baseDuration;
    }

    public void setBaseDuration(Integer baseDuration) {
        this.baseDuration = baseDuration;
    }
}
