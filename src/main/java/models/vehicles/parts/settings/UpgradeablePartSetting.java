package models.vehicles.parts.settings;

public abstract class UpgradeablePartSetting {
    protected static Double healthDecrease;
    protected static Integer maxHealthUpgradeIncrease;
    protected static Integer basePriceFactor;
    protected static Integer baseDuration;

    public static Double getHealthDecrease() {
        return healthDecrease;
    }

    public static void setHealthDecrease(Double healthDecrease) {
        UpgradeablePartSetting.healthDecrease = healthDecrease;
    }

    public static Integer getMaxHealthUpgradeIncrease() {
        return maxHealthUpgradeIncrease;
    }

    public static void setMaxHealthUpgradeIncrease(Integer maxHealthUpgradeIncrease) {
        UpgradeablePartSetting.maxHealthUpgradeIncrease = maxHealthUpgradeIncrease;
    }

    public static Integer getBasePriceFactor() {
        return basePriceFactor;
    }

    public static void setBasePriceFactor(Integer basePriceFactor) {
        UpgradeablePartSetting.basePriceFactor = basePriceFactor;
    }

    public static Integer getBaseDuration() {
        return baseDuration;
    }

    public static void setBaseDuration(Integer baseDuration) {
        UpgradeablePartSetting.baseDuration = baseDuration;
    }
}
