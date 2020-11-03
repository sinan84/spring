package com.spring.services.floor;

import com.spring.interfaces.floorTypes.Floor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Kitchen implements Floor {

    @Value("${radius}")
    Double radius;

    @Override
    public Double getArea() {
        return radius*radius*Math.PI;
    }
}
