import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args)
    {
        System.out.println("Enter amount, Rate, Time:");
        Scanner sc = new Scanner(System.in);
        int amt= sc.nextInt();
        float rate= sc.nextFloat();
        int time = sc.nextInt();
        float SI= amt*rate*time/100;
        System.out.println("The Simple interest is "+ SI);
    }
}
