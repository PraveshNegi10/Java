import java.util.Scanner;
public class SwitchCases {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int ch= sc.nextInt();

        switch (ch)
        {
            case 1:
                System.out.println("I am on leave");
                break;

            case 2:
                System.out.println("I am hoing to office");
                break;

            case 3:
                System.out.println("I am playing football");
                break;
            default:
                System.out.println("I don't know what day it is");

        }
    }
}