package com.ll;
import java.util.Scanner;
public class App {
    public void run() {
        System.out.println("=== 명언 ===");
        int cnt = 0;

        while (true) {
            System.out.print("명령) ");

            Scanner scanner = new Scanner(System.in);
            String cmd = scanner.nextLine();

            if (cmd.equals("종료")) {
                System.out.println("종료");
                break;
            }

            else if (cmd.equals("등록")) {
                System.out.print("명언: ");
                String content = scanner.nextLine();

                System.out.print("작가: ");
                String authorName = scanner.nextLine();

                cnt = cnt + 1;

                System.out.println(cnt + "번 명언이 등록되었습니다.");
                            }

        }

    }
}