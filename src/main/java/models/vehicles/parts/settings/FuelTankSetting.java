package models.vehicles.parts.settings;

public class FuelTankSetting extends ContainerPartSetting {
    private static final Double HEALTH_DECREASE = 0.0D;
    private static final Integer MAX_HEALTH_UPGRADE_INCREASE = 0;
    private static final Integer CAPACITY_INCREASE = 10;
    private static final Integer BASE_PRICE = 100;
    private static final Integer BASE_DURATION = 2;

    {
        healthDecrease = HEALTH_DECREASE;
        maxHealthUpgradeIncrease = MAX_HEALTH_UPGRADE_INCREASE;
        capacityIncrease = CAPACITY_INCREASE;
        basePrice= BASE_PRICE;
        baseDuration = BASE_DURATION;
    }
}
