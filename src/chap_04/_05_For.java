package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 for
        // for (선언; 조건; 증가) {}
        for (int i = 0; i < 10; i++) {
            System.out.println("안녕하세요 " + i);
        }

        // 짝수만 출력
        for (int i = 0; i < 10; i += 2) {
            System.out.println("짝수입니다 " + i);
        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println("짝수입니다 " + i);
            }
        }

        // 홀수만 출력
        for (int i = 1; i < 10; i += 2) {
            System.out.println("홀수입니다 " + i);
        }

        // 거꾸로
        for (int i = 5; i > 0; i--) {
            System.out.println("거꾸로 " + i);
        }

        // 1~10 까지의 합 = 55
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
