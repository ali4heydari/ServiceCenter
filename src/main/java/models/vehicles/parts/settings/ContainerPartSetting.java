package models.vehicles.parts.settings;

public abstract class ContainerPartSetting {
    protected static Double healthDecrease;
    protected static Integer maxHealthUpgradeIncrease;
    protected static Integer capacityIncrease;
    protected static Integer basePrice;
    protected static Integer baseDuration;

    public static Double getHealthDecrease() {
        return healthDecrease;
    }

    public static void setHealthDecrease(Double healthDecrease) {
        ContainerPartSetting.healthDecrease = healthDecrease;
    }

    public static Integer getMaxHealthUpgradeIncrease() {
        return maxHealthUpgradeIncrease;
    }

    public static void setMaxHealthUpgradeIncrease(Integer maxHealthUpgradeIncrease) {
        ContainerPartSetting.maxHealthUpgradeIncrease = maxHealthUpgradeIncrease;
    }

    public static Integer getCapacityIncrease() {
        return capacityIncrease;
    }

    public static void setCapacityIncrease(Integer capacityIncrease) {
        ContainerPartSetting.capacityIncrease = capacityIncrease;
    }

    public static Integer getBasePrice() {
        return basePrice;
    }

    public static void setBasePrice(Integer basePrice) {
        ContainerPartSetting.basePrice = basePrice;
    }

    public static Integer getBaseDuration() {
        return baseDuration;
    }

    public static void setBaseDuration(Integer baseDuration) {
        ContainerPartSetting.baseDuration = baseDuration;
    }
}
