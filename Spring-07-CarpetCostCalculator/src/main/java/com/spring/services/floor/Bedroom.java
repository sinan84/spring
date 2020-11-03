package com.spring.services.floor;

import com.spring.interfaces.floorTypes.Floor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bedroom implements Floor {

    @Value("${width}")
    Double width;

    @Override
    public Double getArea() {
    return width*width;
    }
}
