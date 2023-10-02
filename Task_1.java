package Techno_Hacks_Internship;
import java.util.Scanner;
public class Task_1{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to basic Calculator");
        System.out.println("Available Operation");
        System.out.println("1. Addition(+)");
        System.out.println("2.Subrtraction(-)");
        System.out.println("3.Multiplication(*)");
        System.out.println("4.division(/)");

        System.out.println("Select an Operation(1/2/3/4) : ");
        int Choice =sc.nextInt();

        double result=0.0;
        switch(Choice){
            case 1:
            System.out.println("Enter the 1st number");
            double num1=sc.nextDouble();
            System.out.println("Enter the 2nd number");
            double num2=sc.nextDouble();
         result = num1 + num2;
            break;

            case 2:
            System.out.println("Enter the 1st number");
             num1=sc.nextDouble();
            System.out.println("Enter the 2nd number");
             num2=sc.nextDouble();
         result=num1-num2;
            break;

            case 3:
            System.out.println("Enter the 1st number");
             num1=sc.nextDouble();
            System.out.println("Enter the 2nd number");
             num2=sc.nextDouble();
             result=num1*num2;
            break;

            case 4:
            System.out.println("Enter the Dividend");
         num1=sc.nextDouble();
            System.out.println("Enter the 2nd Divisior");
        num2=sc.nextDouble();
             result=num1/num2;
            break;

            default:
            System.out.println("Please Enter a valid operation");

        }
        System.out.println("Result"+result);
        sc.close();
    }

}
