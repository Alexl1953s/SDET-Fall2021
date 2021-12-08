package maps;

import java.util.HashMap;
import java.util.Map;

public class LowestTemperaturesCaughtByContinent {

    public static void main(String[] args) {

        Map<String, Float> temperatureMap = new HashMap<>();

        temperatureMap.put("North America", -81.4F);
        temperatureMap.put("South America", -27F);
        temperatureMap.put("Antarctica", -128.6F);
        temperatureMap.put("Europe", -72.6F);
        temperatureMap.put("Asia", -90F);
        temperatureMap.put("Africa", -11F);
        temperatureMap.put("Australia", -9.4F);

        System.out.println(temperatureMap);

        if (temperatureMap.containsKey("Asia")) {

            temperatureMap.put("Asia", -91F);
            System.out.println("The new record lowest temperature for Asia has been updated: " + temperatureMap.get("Asia"));
        }

    }
}
