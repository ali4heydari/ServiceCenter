package views;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import models.vehicles.Bike;
import models.vehicles.Car;
import models.vehicles.ElectricCar;
import models.vehicles.parts.settings.Preference;

import static java.lang.reflect.Modifier.TRANSIENT;

public class ServiceCenterView {
    public static void main(String[] args) {
        Bike bike = new Bike();
        Car car = new Car();
        ElectricCar electricCar = new ElectricCar();

        System.out.println(bike.toString());
        System.out.println(car.toString());
        System.out.println(electricCar.toString());

        final Gson gson = new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .excludeFieldsWithModifiers(TRANSIENT) // STATIC|TRANSIENT in the default configuration
                .create();
        Preference preference = new Preference();
        final String json = gson.toJson(preference);
        System.out.println("JSON: " +  json);
        System.out.println(preference.toString());


    }
}
