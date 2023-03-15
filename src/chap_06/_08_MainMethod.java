package chap_06;

public class _08_MainMethod {
    public static void main(String[] args) {
        // 자바가 시작할 때 처음으로 진행하는 부분
        for (String s: args) {
            System.out.println(s);
        }

        // 1. 도서 조회
        // 2. 도서 대출
        // 3. 도서 반납
        if (args.length == 1) {
            switch (args[0]) {
                case  "1":
                    System.out.println("도서 조회");
                    break;
                case "2":
                    System.out.println("도서 대출");
                    break;
                case "3":
                    System.out.println("도서 반납");
                    break;
                default:
                    System.out.println("잘못 입력");
            }
        } else {
            System.out.println("사용법 1 ~ 3 메뉴 중 하나만 입력");
        }
    }
}
