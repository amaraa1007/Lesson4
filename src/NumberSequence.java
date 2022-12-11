import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int biggest = Integer.MAX_VALUE;
        int smallest = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++){
            int number = Integer.parseInt(scan.nextLine());
            if (number < smallest) smallest = number;
            if (number > biggest) biggest = number;
        }
        System.out.println("Max number: " +biggest);
        System.out.println("Min number: " +smallest);
    }
}
