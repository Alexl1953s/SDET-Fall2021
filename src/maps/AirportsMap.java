package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AirportsMap {

    public static void main(String[] args) {

        Map<String, String> airportCodes = new HashMap<>();

        airportCodes.put("ORD", "Chicago International O'hare Airport");
        airportCodes.put("JFK", "John F. Kennedy");
        airportCodes.put("ATL", "Hartsfield-Jackson Atlanta");

        for (Map.Entry<String, String> entry : airportCodes.entrySet()) {
            System.out.printf("%s : %s%n", entry.getKey(), entry.getValue());
        }

    }
}
