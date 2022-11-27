import java.util.Scanner;

public class fnm {
    //camel case naming convention in java 
    public static void printMyName(String name)
    {
        System.out.println("My name is " + name);
        return;
    }
    public static int factorial(int n )
    {
        if(n<0)
        {
            System.out.print("Invlid Input: ");
            return -1;
        }
        int fact = 1;
        for(int i = n; i> 1;i--)
        {
            fact *=i;
        }
        return fact;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(factorial(num)); 
        sc.close();
    }


    
}
