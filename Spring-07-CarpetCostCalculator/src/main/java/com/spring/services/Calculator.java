package com.spring.services;

import com.spring.interfaces.carpetPrices.Carpet;
import com.spring.interfaces.floorTypes.Floor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.NoSuchElementException;
import java.util.Scanner;

@Component
public class Calculator {
    Scanner sc = new Scanner(System.in);
    @Qualifier("carpetTX")
    @Autowired
    private Carpet carpet;
    @Qualifier("kitchen")
    @Autowired
    private Floor floor;

    public double calculator() {
        double price = 0;
        System.out.print("Please, select a state : ");
        String state = sc.next();
        if (state.equalsIgnoreCase("VA") || state.equalsIgnoreCase("VIRGINIA")) {
            System.out.print("Please, select a city : ");
            String city = sc.next();
            if (city.equalsIgnoreCase("ARLINGTON")) {
                System.out.print("Please select your floor type : ");
                String floorType = sc.next();
                if (floorType.equalsIgnoreCase("Bedroom")) price = carpet.getCost(city) * floor.getArea();
                if (floorType.equalsIgnoreCase("Kitchen")) price = carpet.getCost(city) * floor.getArea();
                if (floorType.equalsIgnoreCase("Living Room")) price = carpet.getCost(city) * floor.getArea();
            } else if (city.equalsIgnoreCase("FAIRFAX")) {
                System.out.print("Please select your floor type : ");
                String floorType = sc.next();
                if (floorType.equalsIgnoreCase("Bedroom")) price = carpet.getCost(city) * floor.getArea();
                if (floorType.equalsIgnoreCase("Kitchen")) price = carpet.getCost(city) * floor.getArea();
                if (floorType.equalsIgnoreCase("Living Room")) price = carpet.getCost(city) * floor.getArea();
            } else if (city.equalsIgnoreCase("MCLEAN")) {
                System.out.print("Please select your floor type : ");
                String floorType = sc.next();
                if (floorType.equalsIgnoreCase("Bedroom")) price = carpet.getCost(city) * floor.getArea();
                if (floorType.equalsIgnoreCase("Kitchen")) price = carpet.getCost(city) * floor.getArea();
                if (floorType.equalsIgnoreCase("Living Room")) price = carpet.getCost(city) * floor.getArea();
            } else throw new NoSuchElementException();
        } else if (state.equalsIgnoreCase("TX") || state.equalsIgnoreCase("TEXAS")) {
            System.out.print("Please, select a city : ");
            String city = sc.next();
            if (city.equalsIgnoreCase("DALLAS")) {
                System.out.print("Please select your floor type : ");
                String floorType = sc.next();
                if (floorType.equalsIgnoreCase("Bedroom")) price = carpet.getCost(city) * floor.getArea();
                if (floorType.equalsIgnoreCase("Kitchen")) price = carpet.getCost(city) * floor.getArea();
                if (floorType.equalsIgnoreCase("Living Room")) price = carpet.getCost(city) * floor.getArea();
            } else if (city.equalsIgnoreCase("AUSTIN")) {
                System.out.print("Please select your floor type : ");
                String floorType = sc.next();
                if (floorType.equalsIgnoreCase("Bedroom")) price = carpet.getCost(city) * floor.getArea();
                if (floorType.equalsIgnoreCase("Kitchen")) price = carpet.getCost(city) * floor.getArea();
                if (floorType.equalsIgnoreCase("Living Room")) price = carpet.getCost(city) * floor.getArea();
            } else if (city.equalsIgnoreCase("SAN ANTONIO")) {
                System.out.print("Please select your floor type : ");
                String floorType = sc.next();
                if (floorType.equalsIgnoreCase("Bedroom")) price = carpet.getCost(city) * floor.getArea();
                if (floorType.equalsIgnoreCase("Kitchen")) price = carpet.getCost(city) * floor.getArea();
                if (floorType.equalsIgnoreCase("Living Room")) price = carpet.getCost(city) * floor.getArea();
            } else throw new NoSuchElementException();
        } else throw new NoSuchElementException();
        return price;
    }
}
