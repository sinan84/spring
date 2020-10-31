package com.spring.services;

import org.springframework.stereotype.Component;

import java.util.NoSuchElementException;
import java.util.Scanner;

@Component
public class Calculator {
    Scanner sc = new Scanner(System.in);
    public void calculator(){
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
    }
}
