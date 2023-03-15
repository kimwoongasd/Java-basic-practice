package chap_06;

public class _06_WhenToUser {
    // 메소드 내에서 메소드 호출 가능
    public static int getPower(int number) {
        return power(number, number);
    }

    public static int power(int x, int y) {
        // 3의 3승 구하기
        int res = 1;
        for (int i = 0; i < y; i++) {
            res *= x;
        }
        return res;
    }

    public static void main(String[] args) {
        // 메소드가 필요한 이유
        // 중복된 코드를 줄인다. 코드 간소화


        // 2의 2승 구하기
        /*int res = 1;
        for (int i = 0; i < 2; i++) {
            res *= 2;
        }
        System.out.println(res);*/
        System.out.println(power(2, 2));

        // 3의 3승 구하기
        /*res = 1;
        for (int i = 0; i < 3; i++) {
            res *= 3;
        }
        System.out.println(res);*/
        System.out.println(power(3, 3));

        // 4의 2승 구하기
        /*res = 1;
        for (int i = 0; i < 2; i++) {
            res *= 4;
        }
        System.out.println(res);*/
        System.out.println(power(4, 2));
    }
}
