package chap_13;

import java.util.Scanner;

public class _01_Input {
    public static void main(String[] args) {
        // 사용자 입력
        Scanner sc = new Scanner(System.in);

        /*System.out.println("이름을 입력하세요");
        // 입력받은 값은 String 형태로 반혼
        String name = sc.next();
        System.out.println(name);

        System.out.println("혈액형을 입력하세요");
        String type = sc.next();
        System.out.println(type);

        // 정수형
        System.out.println("숫자를 입력하세요");
        // int i = Integer.parseInt(sc.next());
        int i = sc.nextInt();
        System.out.println(i + " 입력한 숫자");

        // 실수
        System.out.println("몸무게 작성하시오");
        // double d = Double.parseDouble(sc.next());
        double d = sc.nextDouble();
        System.out.println("몸무게 " + d);*/

        System.out.println("어떤 언어를 쓰나요?");
        // sc.next는 띄어쓰기로 구분한다
        String lang = sc.next(); // 한 단어
        sc.nextLine(); // 불필요한ㄴ 문장을 삭제
        // 하나의 문장
        // String lang = sc.nextLine();
        System.out.println("언어 " + lang);
        System.out.println("배운 소감은?");
        // String feel = sc.next(); // 한 문장
        String feel = sc.nextLine();; // 한 문장
        System.out.println("기분은 " + feel);
    }
}
