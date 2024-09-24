import java.util.Scanner;
public class Fibonnaci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of terms you want to see in the series");
        int N = sc.nextInt();
        int num1 =0 ,num2 =1;
        for(int i=1;i<=N;i++){
            System.out.print(num1+" ");
            int num3=num1+num2;
            num1=num2;
            num2=num3;
        }
    }
}