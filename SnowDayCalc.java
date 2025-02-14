package PACKAGE_NAME;

public class SnowDayCalc {
    public static void main(String[] args) {
        int Temp = Integer.valueOf(args[0]);
        double chanceOfSnowstorm = Double.valueOf(args[1]);
        char DOTW = args[2].charAt(0);
        char typeOfschool = args[3].charAt(0);
        boolean scheduledEvents = Boolean.valueOf(args[4]);
        double chanceOfsnowDay = 0;

        if (Temp < -50 || Temp > 100) {
            System.out.println("Your Temperature must be between -50 and 100 degrees fahrenheit.");
        }

        if (chanceOfSnowstorm < 0 || chanceOfSnowstorm > 100) {
            System.out.println("The chance of a snow storm must be between 0 and 100.");
        }

        if (DOTW != 'm' || DOTW != 'M' || DOTW != 't' || DOTW != 'T' || DOTW != 'w' || DOTW != 'W' || DOTW != 'r' || DOTW != 'R' || DOTW != 'f' || DOTW != 'F') {
            System.out.println("You must enter a valid Day of the week (M, T, W, R, F)");
        }

        if !(DOTW = 'p' || DOTW = 'P' || DOTW = 'u' || DOTW = 'U' || DOTW = 'r' || DOTW = 'R' || DOTW = 'v' || DOTW = 'V' || DOTW = 'b' || DOTW = 'B') {
            System.out.println("You must enter a valid Day of the week (P, U, R, V, B)");
        }

        if (scheduledEvents !== false || scheduledEvents !== true) {
            System.out.println("");
        }

        if (Temp <= 32) {
            chanceOfsnowDay += 30;
        } else if (Temp >= 32 && Temp <= 40) {
            chanceOfsnowDay += 15;
        } else if (Temp >= 40 && Temp <= 50) {
            chanceOfsnowDay += 10;
        } else if (Temp >= 50 && Temp <= 60) {
            chanceOfsnowDay += 5;
        } else if (Temp >= 50) {
            chanceOfsnowDay -= 10;
        }


        if (chanceOfSnowstorm == 100) {
            chanceOfsnowDay += 30;
        } else if (chanceOfSnowstorm < 100 && chanceOfSnowstorm >= 80) {
            chanceOfsnowDay += 20;
        } else if (chanceOfSnowstorm < 80 && chanceOfSnowstorm >= 60) {
            chanceOfsnowDay += 15;
        } else if (chanceOfSnowstorm < 60 && chanceOfSnowstorm >= 40) {
            chanceOfsnowDay += 10;
        } else if (chanceOfSnowstorm <= 40) {
            chanceOfsnowDay -= 10;
        }

        if (DOTW == 'F' || DOTW == 'f') {
            chanceOfsnowDay += 10;
        } else if (DOTW == 'R' || DOTW == 'r') {
            chanceOfsnowDay += 8;
        } else if (DOTW == 'W' || DOTW == 'w') {
            chanceOfsnowDay += 6;
        } else if (DOTW == 'T' || DOTW == 't') {
            chanceOfsnowDay += 8;
        } else if (DOTW == 'M' || DOTW == 'm') {
            chanceOfsnowDay += 10;
        }

        if (typeOfschool == 'V' || typeOfschool == 'v') {
            chanceOfsnowDay += 10;
        } else if (typeOfschool == 'U' || typeOfschool == 'u') {
            chanceOfsnowDay += 8;
        } else if (typeOfschool == 'R' || typeOfschool == 'r') {
            chanceOfsnowDay += 6;
        } else if (typeOfschool == 'P' || typeOfschool == 'p') {
            chanceOfsnowDay += 8;
        } else if (typeOfschool == 'B' || typeOfschool == 'b') {
            chanceOfsnowDay += 10;
        }

        System.out.println("Your chance of having a snow day is " + chanceOfsnowDay + "%.");
    }
}
