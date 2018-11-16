package views;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import models.vehicles.Bike;
import models.vehicles.Car;
import models.vehicles.ElectricCar;
import models.vehicles.parts.settings.Preference;


public class ServiceCenterView {
    public static void main(String[] args) {
        Bike bike = new Bike();
        Car car = new Car();
        ElectricCar electricCar = new ElectricCar();

        System.out.println(bike.toString());
        System.out.println(car.toString());
        System.out.println(electricCar.toString());

        final Gson gson = new GsonBuilder()// STATIC|TRANSIENT in the default configuration
                .serializeNulls()

                .create();
        Preference preference = new Preference();
        String json = gson.toJson(preference);
        final String str = "{\"defaultMaxHelath\":100.0,\"electricityPrice\":1.0,\"gasPrice\":1.0,\"engineBaseTotalPossibleDistance\":50000,\"gasEngineSetting\":{\"healthDecrease\":0.01,\"maxHealthUpgradeIncrease\":50,\"basePriceFactor\":100,\"baseDuration\":24},\"electricEngineSetting\":{\"healthDecrease\":0.01,\"maxHealthUpgradeIncrease\":40,\"basePriceFactor\":100,\"baseDuration\":24},\"wheelSetting\":{\"healthDecrease\":0.05,\"maxHealthUpgradeIncrease\":30,\"basePriceFactor\":10,\"baseDuration\":1},\"oilSetting\":{\"healthDecrease\":0.01,\"maxHealthUpgradeIncrease\":10,\"basePriceFactor\":5,\"baseDuration\":1},\"fuelTankSetting\":{\"healthDecrease\":0.0,\"maxHealthUpgradeIncrease\":0,\"capacityIncrease\":10,\"basePrice\":100,\"baseDuration\":2},\"engineBatterySetting\":{\"healthDecrease\":0.0,\"maxHealthUpgradeIncrease\":0,\"capacityIncrease\":10,\"basePrice\":100,\"baseDuration\":2}}";
        System.out.println("JSON: " +  json);

        Preference p = gson.fromJson(str,Preference.class);
        System.out.println(p.toString());


    }
}
