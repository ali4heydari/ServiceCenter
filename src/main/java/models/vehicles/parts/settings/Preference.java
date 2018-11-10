package models.vehicles.parts.settings;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import java.io.*;

public class Preference {
    double defaultMaxHelath;
    float electricityPrice;
    float gasPrice;
    int engineBaseTotalPossibleDistance;
    GasEngineSetting gasEngineSetting;
    ElectricEngineSetting electricEngineSetting;
    WheelSetting wheelSetting;
    OilSetting oilSetting;
    FuelTankSetting fuelTankSetting;
    EngineBatterySetting engineBatterySetting;

    @Override
    public String toString() {
        return "Preference{" +
                "defaultMaxHelath=" + defaultMaxHelath +
                ", electricityPrice=" + electricityPrice +
                ", gasPrice=" + gasPrice +
                ", engineBaseTotalPossibleDistance=" + engineBaseTotalPossibleDistance +
                ", gasEngineSetting=" + gasEngineSetting +
                ", electricEngineSetting=" + electricEngineSetting +
                ", wheelSetting=" + wheelSetting +
                ", oilSetting=" + oilSetting +
                ", fuelTankSetting=" + fuelTankSetting +
                ", engineBatterySetting=" + engineBatterySetting +
                '}';
    }

    public Preference loadFromFile(String fileName) {
        Object fromJson = null;
        try {
            JsonReader reader = new JsonReader(new FileReader(fileName));
            fromJson=new Gson().fromJson(reader, Preference.class);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return fromJson instanceof Preference ? (Preference) fromJson : null;
    }

    public boolean saveToFile(String fileName) {
        try (Writer writer = new FileWriter(fileName)) {
            Gson gson = new GsonBuilder().create();
            gson.toJson(this, Preference.class);
            return true;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return false;
        }
    }
}
