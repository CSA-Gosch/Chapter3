package MetricConversion;

import java.util.Scanner;

public class MetricConversions {
    public static void main(String[] args)
    {
        double convertMetric;
        double convertBruh;
        double metricEntry;

        GetMeasurments gallons1 = new GetMeasurments();
        GetMeasurments inches1 = new GetMeasurments();

        Scanner input = new Scanner(System.in);
        System.out.println("Frickin enter a unit of measure to be converted >>>");
        metricEntry = input.nextDouble();

        convertMetric = LitersToGallon(metricEntry);
        gallons1.setGallonConvert(convertMetric);
        convertBruh = CentiToInches(metricEntry);
        inches1.setInchesConvert(convertBruh);

        System.out.println("Your entry in Gallons: " + convertMetric + " \nAnd Inches: " + convertBruh);

        System.out.println(gallons1.getGallonConvert() + " gallons");
        System.out.println(inches1.getInchesConvert() + " inches");

    }
    public static double LitersToGallon(double l)
    {
        double convertG;
        convertG = l / 3.7854;
        return convertG;
    }
    public static double CentiToInches(double c)
    {
        double convertI;
        convertI = c / 2.54;
        return convertI;
    }
}
