// 円からドルへの変換（1ドル150円とする）
import java.util.Scanner;

public class 02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println(a / 150);
        System.out.println(a % 150);
    }
}