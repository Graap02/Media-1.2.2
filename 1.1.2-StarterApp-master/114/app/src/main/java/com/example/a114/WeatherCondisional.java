package com.example.a114;

public class WeatherCondisional
{
    public static String getWeatherAdvice(int temperature, String description){
        boolean windy = false;

        if(description.indexOf("windy") >= 0) {
            windy = true;
        }
        if((temperature > 100) && (description.indexOf("snow") >= 0)) {
            return("Fake News!");
        }
        if(description.indexOf("Zombies") >= 0) {
            return("Board Up All Doors And Windows! There Are " +
                    description + " Outside!");
        }
        if((temperature < 100 && temperature > 30) && (description.indexOf("rain") >= 0)) {
            return("Get An Umbrella!");
        }
        if(!windy && (temperature > 30)) {
            return("It's safe outside: " + temperature + " degrees and " +
                    description + ".");
        }
        else
            return "Too Bad Outside!";
    }
}