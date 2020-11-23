package com.spring.services.carpet;

import com.spring.enums.City;
import com.spring.interfaces.carpetPrices.Carpet;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
public class CarpetVA implements Carpet {

    private static final Map<City, BigDecimal> squarePriceForCity = new HashMap<>();

    static {
        squarePriceForCity.put(City.MCLEAN, new BigDecimal("4.32"));
        squarePriceForCity.put(City.ARLINGTON, new BigDecimal("2.92"));
        squarePriceForCity.put(City.FAIRFAX, new BigDecimal("5.34"));
    }

    @Override
    public BigDecimal getStfTPrice(City city) {
        BigDecimal defaultValue = BigDecimal.ZERO;
        Optional<Map.Entry<City, BigDecimal>> collect = squarePriceForCity.entrySet().stream()
                .filter(x -> x.getKey() == city).findFirst();
        return collect.isPresent() ? collect.get().getValue() : defaultValue;
    }
}
