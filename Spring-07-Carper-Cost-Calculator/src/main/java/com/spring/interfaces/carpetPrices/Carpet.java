package com.spring.interfaces.carpetPrices;

import com.spring.enums.City;

import java.math.BigDecimal;

public interface Carpet {
    BigDecimal getStfTPrice(City city);
}
