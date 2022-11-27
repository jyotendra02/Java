import java.util.Scanner;
public class calculator {
    public static void main (String args[])
    {
        System.out.println("Enter Two Numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int op;
        do{
        System.out.println("Enter Your Choice:\n1.Addition \n2.Subtraction \n3.Division \n4.Multiplication \n5.Remainder \n6.Exit\n----------------------------------");
        op = sc.nextInt();

        switch(op)
        {
            case 1: 
            System.out.println("Addition is: " + (a+b));
            break;
            case 2:
            System.out.println("Subtraction is: " + (a-b));
            break;
            case 3:
            System.out.println("Division is: " + (a/b));
            break;
            case 4:
            System.out.println("Multiplication is: " + (a*b));
            break;
            case 5:
            System.out.println("Remainder is: " + (a%b));
            break;
            case 6:
            break;
            default:
            System.out.println("!!Invalid Choice.!!");
        }    
        System.out.println("----------------------------------");   
        }while(op!=6);
        sc.close();
    }
        
}
