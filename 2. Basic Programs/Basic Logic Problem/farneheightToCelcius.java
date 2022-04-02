import java.util.Scanner;

public class farneheightToCelcius {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        float Fahrenheit = scn.nextFloat();

        float Celsius;
        Fahrenheit = 43;
        Celsius = ((Fahrenheit - 32) * 5) / 9;
        System.out.println("Temperature in celsius is: " + Celsius);
        scn.close();
    }
}
