package models.vehicles.parts.settings;

public abstract class ContainerPartSetting {
    public Double healthDecrease;
    public Integer maxHealthUpgradeIncrease;
    public Integer capacityIncrease;
    public Integer basePrice;
    public Integer baseDuration;

    @Override
    public String toString() {
        return "ContainerPartSetting{" +
                "healthDecrease=" + healthDecrease +
                ", maxHealthUpgradeIncrease=" + maxHealthUpgradeIncrease +
                ", capacityIncrease=" + capacityIncrease +
                ", basePrice=" + basePrice +
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

    public Integer getCapacityIncrease() {
        return capacityIncrease;
    }

    public void setCapacityIncrease(Integer capacityIncrease) {
        this.capacityIncrease = capacityIncrease;
    }

    public Integer getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(Integer basePrice) {
        this.basePrice = basePrice;
    }

    public Integer getBaseDuration() {
        return baseDuration;
    }

    public void setBaseDuration(Integer baseDuration) {
        this.baseDuration = baseDuration;
    }
}
