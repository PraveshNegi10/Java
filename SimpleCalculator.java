import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;
public class SimpleCalculator {
    public  static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        System.out.println("Enter operation:");
        sc.nextLine();
        char ch = sc.nextLine().charAt(0);
        switch (ch)
        {
            case '+':
                System.out.println(n1 + n2);
                break;
            case '-':
                System.out.println(n1-n2);
                break;
            case '*':
                System.out.println(n1*n2);
                break;
            case '/':
                System.out.println(n1/n2);
                break;
            default:
                System.out.println("Wrong Operation");

        }
    }
}