package models.vehicles.parts.settings;

public class GasEngineSetting extends UpgradeablePartSetting{
    private static final Double HEALTH_DECREASE = 0.01D;
    private static final Integer MAX_HEALTH_UPGRADE_INCREASE = 50;
    private static final Integer BASE_PRICE_FACTOR = 100;
    private static final Integer BASE_DURATION = 24; //hour
    {
        healthDecrease = HEALTH_DECREASE;
        maxHealthUpgradeIncrease = MAX_HEALTH_UPGRADE_INCREASE;
        basePriceFactor = BASE_PRICE_FACTOR;
        baseDuration = BASE_DURATION;
    }

    @Override
    public String toString() {
        return "GasEngineSetting{" +
                "healthDecrease=" + healthDecrease +
                ", maxHealthUpgradeIncrease=" + maxHealthUpgradeIncrease +
                ", basePriceFactor=" + basePriceFactor +
                ", baseDuration=" + baseDuration +
                '}';
    }
}
