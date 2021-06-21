package userInput;
import java.util.Scanner;
public class ScannerUserInput {
    public static void main(String[] args)
    {
        System.out.println("Type:");
        Scanner sc =new Scanner(System.in);
//        int x= sc.nextInt();
//        System.out.println(x);
        String str = sc.nextLine();
        System.out.println(str);



    }
}
