import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scan.nextLine());
            if (i % 2 == 0) evenSum += number;
            else oddSum += number;
        }
        if (evenSum == oddSum)
            System.out.println("Yes Sum = " + evenSum);
        else
            System.out.println("No Diff = " + Math.abs(evenSum - oddSum));
        LeftRightSum left;
        left.getTest();
    }
}
