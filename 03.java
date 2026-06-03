// じゃんけんで勝つ手を出力（グーを0，チョキを2，パーを5）
import java.util.Scanner;

public class 03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int m = scan.nextInt();
        switch (m) {
            case 0:
                System.out.println("5");
                break;
            case 2:
                System.out.println("0");
                break;
            case 5:
                System.out.println("2");
                break;
            default:
            System.out.println("error");
        }
    }
}
