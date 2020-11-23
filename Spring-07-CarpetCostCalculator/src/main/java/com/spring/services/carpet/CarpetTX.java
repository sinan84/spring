package com.spring.services.carpet;

import com.spring.interfaces.carpetPrices.Carpet;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CarpetTX implements Carpet {
    public static Map<String, Double> mapTX = new HashMap<String, Double>();

    static {
        mapTX.put("DALLAS", 5.10);
        mapTX.put("AUSTIN", 3.60);
        mapTX.put("SAN ANTONIO", 2.90);

    }

    @Override
    public Double getCost(String city) {
        Double dummy = 0.0;
        if (city == "DALLAS") dummy = mapTX.get(city);
        else if (city == "AUSTIN") dummy = mapTX.get(city);
        else if (city == "SAN ANTONIO") dummy = mapTX.get(city);
        return dummy;
    }
}
