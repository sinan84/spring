package com.spring.services;

import com.spring.enums.City;
import com.spring.services.carpet.CarpetTX;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;

@Component
public class Calculator {
    public static void main(String[] args) {
        Map<Object,Map<Enum,Integer>> map = new HashMap<>();
        //map.put(new CarpetTX(), map.put(new City[0],10));
    }
    Scanner sc = new Scanner(System.in);
    public double calculator(){
        double price=0;
        System.out.print("Please, select a state : ");
        String state = sc.next();
        if (state.equalsIgnoreCase("VA")||state.equalsIgnoreCase("VIRGINIA")){
            System.out.print("Please, select a city : ");
            String city = sc.next();
            if (city.equalsIgnoreCase("ARLINGTON")){

            }else  if (city.equalsIgnoreCase("FAIRFAX")){

            }else  if (city.equalsIgnoreCase("MCLEAN")){

            }else throw new NoSuchElementException();
        }else if (state.equalsIgnoreCase("TX")||state.equalsIgnoreCase("TEXAS")){
            System.out.print("Please, select a city : ");
            String city = sc.next();
            if (city.equalsIgnoreCase("DALLAS")){

            }else  if (city.equalsIgnoreCase("AUSTIN")){

            }else  if (city.equalsIgnoreCase("SAN ANTONIO")){

            }else throw new NoSuchElementException();
        }else throw new NoSuchElementException();
    return price;
    }
}
