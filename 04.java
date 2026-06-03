// 標準体重との差の出力
import java.util.Scanner;

public class 04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //身長(cm)の入力
        double a = scan.nextDouble();
        //体重(kg)の入力
        double b = scan.nextDouble();
        double n = a / 100;
        //標準体重の計算
        double m = n * n * 22;
        
        //標準体重より10kg軽いとき
        if (b - m < -10) {
            System.out.println("Underweight");
        }
        //標準体重との差が10kg以下のとき
        if (-10 <= b - m && b - m <= 10) {
            System.out.println("Normal");
        }
        //標準体重より10kg重いとき
        if (10 < b - m) {
            System.out.println("Overweight");
        }
        
    }
}
