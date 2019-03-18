package com.example.a114;
import java.util.Scanner;
public class StringTester
{
    public void tester() {
        String result;
        String result2;
        int intResult;

        result = "What Is The Weather?";
        result2 = "What Is The Temp?";
        intResult = Integer.parseInt(result2);
        System.out.println(WeatherCondisional.getWeatherAdvice(intResult, result));
    }
}