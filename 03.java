// じゃんけんで勝つ手を出力（グーを1，チョキを2，パーを3）
import java.util.Scanner;

public class 03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int m = scan.nextInt();
        switch (m) {
            case 1:
                System.out.println("3");
                break;
            case 2:
                System.out.println("1");
                break;
            case 3:
                System.out.println("2");
                break;
            default:
            System.out.println("0");
        }
    }
}