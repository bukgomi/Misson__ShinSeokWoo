package com.ll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public void run() {
        System.out.println("=== 명언 ===");
        int cnt = 0;
        int lastQuotationId = 0;
        List<Quotation> quotations = new ArrayList<>();

        while (true) {
            System.out.print("명령) ");

            Scanner scanner = new Scanner(System.in);
            String cmd = scanner.nextLine();

            if (cmd.equals("종료")) {
                System.out.println("종료");
                break;
            } else if (cmd.equals("등록")) {
                System.out.print("명언: ");
                String content = scanner.nextLine();

                System.out.print("작가: ");
                String authorName = scanner.nextLine();
                cnt = cnt + 1;

                lastQuotationId++;
                int id = lastQuotationId;

                Quotation quotation = new Quotation(id, content, authorName);
                quotations.add(quotation);

                System.out.println(cnt + "번 명언이 등록되었습니다.");
            } else if (cmd.equals("목록")) {
                System.out.println("번호 / 작가 / 명언");
                System.out.println("-------------------");
                if (quotations.isEmpty())
                    System.out.println("등록된 명언이 없습니다.");
                for (int i = quotations.size() - 1; i >= 0; i--) {
                    Quotation quotation = quotations.get(i);
                    System.out.printf("%d / %s / %s\n", quotation.id, quotation.authorName, quotation.content);
                }
            } else if (cmd.startsWith("삭제")) {
                int id = Integer.parseInt(cmd.split("=")[1]);
                for (int i = 0; i < quotations.size(); i++) {
                    if (quotations.get(i).getId() == id) {
                        quotations.remove(i);
                        System.out.println(id + "번 명언이 삭제되었습니다.");
                    } else {
                        System.out.println(id + "번 명언은 존재하지 않습니다.");
                    }
                    break;
                }
            }

        }
    }
}
