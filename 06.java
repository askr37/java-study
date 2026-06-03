//縦の長さがｍ、横の長さがｎの四角形を描画する
import java.util.Scanner;

public class 06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt(); //縦の長さ
        int m = scan.nextInt(); //横の長さ

        for (int i=1; i<=n; i++) {
            //1行目とｎ行目
            if (i==1 || i==n) {
                for (int j=1; j<=m; j++) {
                    System.out.print("-");
                }
            } else {
                System.out.print("|");

                for (int j=1; j<=m-2; j++) {
                    System.out.print(" ");
                }

                System.out.print("|");
            }

            System.out.println();
        }
    }
}