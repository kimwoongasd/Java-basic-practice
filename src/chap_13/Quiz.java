package chap_13;

import java.io.*;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        // 내코드
        /*try (BufferedWriter bw = new BufferedWriter(new FileWriter("saying.txt", true))) {
            bw.write("문제 : 세살 __ 여든까지 간다");
            bw.newLine();
            bw.write("버릇");
            bw.newLine();
            bw.write("문제 : 소 잃고 __ 고친다");
            bw.newLine();
            bw.write("외양간");
            bw.newLine();
            bw.write("문제 : 천 리 길도 한 _부터");
            bw.newLine();
            bw.write("걸음");
            bw.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (BufferedReader br = new BufferedReader(new FileReader("saying.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains("문제")) {
                    System.out.println(line);
                } else {
                    Scanner sc = new Scanner(System.in);
                    if (line.equals(sc.next())) {
                        System.out.println("정답");
                    } else {
                        System.out.println("실패");
                        System.out.println("정답은 " + line);
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/
        Scanner sc = new Scanner(System.in);
        System.out.println("속담퀴즈");
        System.out.println("----------");

        try (BufferedReader br = new BufferedReader(new FileReader("saying.txt"))) {
            String quiz;
            String answer;
            String input;
            while (true) {
                quiz = br.readLine();
                answer = br.readLine();
                if (quiz == null || answer == null) {
                    break;
                }

                System.out.println("문제 " + quiz);
                System.out.println("정답 입력 : ");
                input = sc.next();
                if (input.equals(answer)) {
                    System.out.println("정답");
                } else {
                    System.out.println("실패");
                    System.out.println("정답은 " + answer);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
