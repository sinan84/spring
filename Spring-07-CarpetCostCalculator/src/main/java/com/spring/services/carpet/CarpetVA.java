package com.spring.services.carpet;

import com.spring.interfaces.carpetPrices.Carpet;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CarpetVA implements Carpet {
    public static Map<String, Double> mapTX = new HashMap<String, Double>();
    static {
        mapTX.put("ARLINGTON", 8.20);
        mapTX.put("FAIRFAX", 10.30);
        mapTX.put("MCLEAN", 7.40);

    }
    @Override
    public Double getCost(String city) {
        Double dummy = 0.0;
        if (city=="ARLINGTON") dummy = mapTX.get(city);
        else if (city=="FAIRFAX") dummy = mapTX.get(city);
        else if (city=="MCLEAN") dummy = mapTX.get(city);
        return dummy;
    }
}
