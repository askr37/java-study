//2個以上30個以下の正整数を入力すると、値を入力した逆の順番で出力する
import java.util.Scanner;

public class 07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] a = new int[30];
        int n = 0;

        while (scan.hasNextInt()) {
            a[n] = scan.nextInt();
            n++;
        }
        //逆順で出力
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}