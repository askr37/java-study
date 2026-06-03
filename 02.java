// 円からドルへの変換（1ドル170円とする）
import java.util.Scanner;

public class 02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println(a / 170);
        System.out.println(a % 170);
    }
}
