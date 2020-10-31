package com.spring.services.floor;

import com.spring.interfaces.floorTypes.Floor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Bedroom implements Floor {

    @Value("${width}")
    BigDecimal width;

    @Override
    public BigDecimal getArea() {
        return width.pow(2);
    }
}
