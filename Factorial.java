import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        int fact = factorial(a);

        System.out.println("Factorial of "+a+" is "+fact);
    }

    public static int factorial(int a){
        if (a == 0 || a==1 )
            return 1;

        if(a<0)
            return -1;
        int fact = 1;
        for(int i=1; i<=a; i++){
            fact *= i;
        }
        return fact;
    }
}