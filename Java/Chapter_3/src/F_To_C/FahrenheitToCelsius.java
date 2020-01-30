package F_To_C;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args)
    {
        double convertF;
        double celsiusEntry;
        GetStuff celsiusNum1 = new GetStuff();
        GetStuff fahrenheitNum1 = new GetStuff();

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a temperature in celsius >>>>");
        celsiusEntry = input.nextDouble();

        convertF = convertFahrenheit(celsiusEntry);
        celsiusNum1.setCelsiusTemp(celsiusEntry);
        System.out.println("The temperature in fahrenheit is " + convertF);
        fahrenheitNum1.setFahrenheitTemp(convertF);

        System.out.println(celsiusNum1.getCelsiusTemp() + " celsius temperature.");
        System.out.println(fahrenheitNum1.getFahrenheitTemp() + " fahrenheit temperature.");

    }
    public static double convertFahrenheit(double c)
    {
        double convertF;
        convertF = c * (9/5) + 32;
        return convertF;
    }
}
