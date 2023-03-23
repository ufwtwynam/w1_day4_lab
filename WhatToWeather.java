import java.util.Scanner;

public class WhatToWeather {
    public static void main(String[] args) {
        // Prompt user to describe weather
        System.out.println("Is it rainy, sunny, cloudy, or snowy?");

        // Take weather description input
        Scanner readerW = new Scanner(System.in);
        String WeatherDescription = readerW.nextLine();

//        // Assign Weather
//        if (WeatherDescription.equals("Rainy")){
//            String Weather = "Rainy";}
//        else if (WeatherDescription.equals("Sunny")){
//            String Weather = "Sunny";}
//        else if (WeatherDescription.equals("Cloudy")){
//            String Weather = "Cloudy";}
//        else if (WeatherDescription.equals("Snowing")){
//            String Weather = "Snowing";}
//        else {
//            System.out.println("Enter valid weather description");
//        }
//              Realised above might be unnecessary

        // Prompt user to describe temperature
        System.out.println("Enter average temperature");

        // Take temperature input
        Scanner readerT = new Scanner(System.in);
        int AvgTemp = readerT.nextInt();

        // Output clothing suggestions based on inputs
        if (WeatherDescription.equals("Rainy") && AvgTemp < 12){
            System.out.println("Thick waterproof jacket");
        } else if (WeatherDescription.equals("Rainy") && AvgTemp >= 12){
            System.out.println("Thin waterproof jacket");
        } else if (WeatherDescription.equals("Sunny") && AvgTemp < 12){
            System.out.println("Any thick jacket, sunglasses");
        } else if (WeatherDescription.equals("Sunny") && AvgTemp >= 12){
            System.out.println("Keep it thin, sunglasses");
        } else if (WeatherDescription.equals("Cloudy") && AvgTemp < 12){
            System.out.println("Any thick jacket");
        } else if (WeatherDescription.equals("Cloudy") && AvgTemp >= 12){
            System.out.println("Keep it thin");
        } else if (WeatherDescription.equals("Snowy") && AvgTemp < 5){
            System.out.println("Thick waterproof jacket");
        } else if (WeatherDescription.equals("Snowy") && AvgTemp >= 5){
            System.out.println("Really?");
        }
    }
}
