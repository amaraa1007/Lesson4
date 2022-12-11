import java.util.Scanner;

public class Number1To100 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
//        for (int i = n; i >= 1; i--){
//            System.out.println(i);
//        }
        for (int i = 1; i <= n; ++i){
            System.out.println(i);
        }
    }
}
