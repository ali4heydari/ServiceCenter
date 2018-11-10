package models.vehicles.parts.settings;

public class OilSetting extends UpgradeablePartSetting{
    private static final Double HEALTH_DECREASE = 0.01D;
    private static final Integer MAX_HEALTH_UPGRADE_INCREASE = 10;
    private static final Integer BASE_PRICE_FACTOR = 5;
    private static final Integer BASE_DURATION = 1;
    {
        healthDecrease = HEALTH_DECREASE;
        maxHealthUpgradeIncrease = MAX_HEALTH_UPGRADE_INCREASE;
        basePriceFactor = BASE_PRICE_FACTOR;
        baseDuration = BASE_DURATION;
    }
}
