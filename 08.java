//入力した各行の文字数(空白含まず)を1行に1つずつ出力する
import java.util.Scanner;

public class 08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while (scan.hasNextLine()) {
            String str = scan.nextLine();
            int n = str.replace(" ", "").length();
            System.out.println(n);
        }
    }
}