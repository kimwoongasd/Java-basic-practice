package chap_06;

public class _02_Parameter {
    public static void power(int num) {
        // Parameter, 매개변수
        int res = num * num;
        System.out.println(num + "의 승은 " + res);
    }

    // 전달값 2개 이상
    // x의 y제곱
    public static void powser_ex(int x, int y) {
        int res = 1;
        for (int i = 0; i < y; i++) {
            res *= x;
        }
        System.out.println(x + "의 " + y + "승은 " + res);
    }

    public static void main(String[] args) {
        // 전달값이 있는 Parameter
        // 제곱 메소드 만들기

        // 인수 : Argument 을 넣어줘야 한다
        power(2);

        int x = 3;
        power(x);

        powser_ex(2, 3);
        powser_ex(3, 3);
        powser_ex(5, 0);
    }
}
