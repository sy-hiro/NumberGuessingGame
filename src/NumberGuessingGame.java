import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // 1から100までのランダムな数を生成
        Random random = new Random();
        int correctNumber = random.nextInt(100) + 1;

        // ユーザーからの入力を受け取るためのScanner
        Scanner scanner = new Scanner(System.in);
        int guess = 0;

        System.out.println("1から100までの数を当ててください。");

        // ユーザーが正解するまでループ
        while (guess != correctNumber) {
            System.out.print("数を入力してください: ");
            guess = scanner.nextInt();

            // 入力された数に応じてフィードバックを出す
            if (guess < correctNumber) {
                System.out.println("もっと大きな数です。");
            } else if (guess > correctNumber) {
                System.out.println("もっと小さな数です。");
            } else {
                System.out.println("正解です！");
            }
        }

        // プログラム終了メッセージ
        System.out.println("ゲームを終了します。");
        scanner.close();
    }
}