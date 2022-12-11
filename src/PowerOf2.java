import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        System.out.println((int) 202.0);
        for (int i = 0; i <= n; i += 2) {
            System.out.println((int) Math.pow(2, i));
        }
    }
}
