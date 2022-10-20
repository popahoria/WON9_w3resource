

package org.fasttrackit;


public class w3resource {

    public static Double tempConverter(Double temperature) {
        if (temperature == null) {
            return null;
        } else {
            temperature = (temperature - 32) * 5.0 / 9;
        }
        return temperature;
    }

    public static Double inchToMeters(Double length) {
        if (length == null) {
            return null;
        } else {
            length = length * 0.0254;
        }
        return length;
    }

    public static int sumOfDigits(int digits) {

        String numberOfDigits = Integer.toString(digits);
        int[] numbers = new int[numberOfDigits.length()];
        for (int i = 0; i < numberOfDigits.length(); i++) {
            numbers[i] = numberOfDigits.charAt(i) - '0';
            digits = numbers[0] + numbers[1] + numbers[2];
        }
        return digits;
    }


    public static int minutes(int minutes) {

        int year = minutes / 525600;
        int remainingMinutes = minutes % 525600;
        int day = remainingMinutes / 1440;
        System.out.println(year + " years and " + day + " days");
        return minutes;

    }

    public static int gmt(int gmt) {

        long timeZoneChange = gmt;
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = ((totalHours + timeZoneChange) % 24);
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);

        return gmt;
    }

    public static double bmi(double weight, double height) {
        double kiloWeight = weight * 0.45359237;
        double meterHeight = height * 0.0254;
        double bmi = kiloWeight / (meterHeight * meterHeight);
        return bmi;
    }

    public static Object speedConvertor(int meters, int hours, int minutes, int seconds) {
        double hoursToSeconds = hours * 3600;
        double minutesToSeconds = minutes * 60;
        double totalSecond = hoursToSeconds + minutesToSeconds + seconds;
        double kilometer = meters / 1000;
        double metersToMiles = meters * 0.000621371;
        double metersPerSeconds = meters / totalSecond;
        double kilometerPerHour = kilometer / (totalSecond / 3600);
        double milesPerHour = metersToMiles / (totalSecond / 3600);
        System.out.println("Your speed in meters/second is: " + metersPerSeconds + "\n" +
                "Your speed in km/h is: " + kilometerPerHour + "\n" +
                "Your speed in miles/h is: " + milesPerHour);
        return null;
    }

    public static Object squareCubeAndForth(double number) {
        double square = Math.pow(number, 2);
        double cube = Math.pow(number, 3);
        double forth = Math.pow(number, 4);
        System.out.println("Square: " + square + "\n" +
                "Cube: " + cube + "\n" +
                "Forth power : " + forth);
        return null;
    }

    public static Object numbersCompare(int number1, int number2) {
        int sum = number1 + number2;
        int diff = number1 - number2;
        int product = number1 * number2;
        double average = (number1 + number2) / 2;
        int distance = number1 - number2;
        int max = 0;
        int min = 0;

        if (number1 > number2) {
            max += number1;
            min += number2;
        } else {
            max += number2;
            min += number1;
        }

        System.out.println("Sum of two integers: " + sum + "\n" +
                "Difference of two integers: " + diff + "\n" +
                "Product of two integers:" + product + "\n" +
                "Average of two integers: " + average + "\n" +
                "Distance of two integers: " + distance + "\n" +
                "Max integer: " + max + "\n" +
                "Min integer: " + min);
        return null;
    }

    public static Object breaker(int number) {
        String numberOfDigits = Integer.toString(number);
        System.out.println(numberOfDigits.charAt(0) + " " + numberOfDigits.charAt(1) + " " + numberOfDigits.charAt(2) + " " + numberOfDigits.charAt(3) + " " + numberOfDigits.charAt(4) + " " + numberOfDigits.charAt(5));
        
        return null;
    }


}