//2つの正整数値を入力し、小さい値から大きい値までの整数値の和を計算する
import java.util.Scanner;

public class 05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        int sum = 0;
        //最初に入力した値の方が小さいとき
        if (a < b) {
            for (int i=a; i<=b; i++) {
            sum += i;
            }
        //最初に入力した値の方が大きいとき
        } else {
            for (int i=b; i<=a; i++) {
            sum += i;
            }
        }
        //和を計算
        System.out.println(sum);
    }
}