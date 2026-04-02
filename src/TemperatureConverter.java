import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(" enter the temperature:");
        float temp= scan.nextFloat();
        System.out.println(" now enter what unit it is in :(c or f)");
        char unit=scan.next().charAt(0);

        if (unit=='c'||unit=='C')
        {
            float fahrenheit=(temp*9/5)+32;
            System.out.println(String.format("%.1f°C = %.1f°F", temp, fahrenheit));
        }
        else if (unit=='f'|| unit=='F') {
         float celsius=(temp-32)*5/9;
            System.out.println(String.format("%.1f°F = %.1f°C", temp, celsius));
        }
        else {
            System.out.println("enter a valid unit");
        }

    }
}
