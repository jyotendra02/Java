import java.util.Scanner;

public class numcount {
    static Scanner in = new Scanner(System.in);

    public static void countNum(int count) {
       
        int pos = 0, zero = 0, neg = 0, num;
        for (int i = 1; i <= count; i++) {
            num = in.nextInt();
            if (num > 0)
                pos++;
            else if (num < 0)
                neg++;
            else
                zero++;
        }
        System.out.println("Zeros: " + zero);
        System.out.println("Positives: " + pos);
        System.out.println("Negatives: " + neg);
    }
    public static void main(String[] args) {
        System.out.print("How many numbers you want to enter:  ");
       int num = in.nextInt();
        countNum(num);
    }
}
