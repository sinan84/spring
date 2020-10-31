package com.spring.services.carpet;

import com.spring.enums.City;
import com.spring.interfaces.carpetPrices.Carpet;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
public class CarpetTX implements Carpet {
    private static final Map<City, BigDecimal> squarePriceForCity = new HashMap<>();
    static {
        squarePriceForCity.put(City.AUSTIN, new BigDecimal("1.32"));
        squarePriceForCity.put(City.DALLAS, new BigDecimal("1.75"));
        squarePriceForCity.put(City.SAN_ANTONIO, new BigDecimal("2.20"));
    }

    @Override
    public BigDecimal getStfTPrice(City city) {
        BigDecimal defaultValue = BigDecimal.ZERO;
        Optional<Map.Entry<City, BigDecimal>> collect = squarePriceForCity.entrySet().stream()
                .filter(x -> x.getKey() == city).findFirst();
        return collect.isPresent() ? collect.get().getValue() : defaultValue;
    }
}
