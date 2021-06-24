public class IntroductionToMethods {
    public static void main(String[] args)
    {
        int a = 34;
        int b = 22;
        int result= maxOf(a,b);
        System.out.println(result);
        sayHi();

    }
    static int maxOf(int a, int b)
    {
        if(a>b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
    static void sayHi()
    {
        System.out.println("Hi");
        System.out.println("Good morning");
    }
}
