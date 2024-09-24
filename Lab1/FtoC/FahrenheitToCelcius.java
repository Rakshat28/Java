import java.util.Scanner;
public class FahrenheitToCelcius{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temp in F ");
        double fahrenheit = sc.nextInt();
        double celcius = (fahrenheit-32)*5/9;
        System.out.println("The temperature in celcius is :"+celcius);

    }
}