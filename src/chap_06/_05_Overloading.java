package chap_06;

public class _05_Overloading {
    // 문자열을 정수로
    public static int getPower(String strNumber) {
        int num = Integer.parseInt(strNumber);
        return num * num;
    }

    public static int getPower(int number) {
        int res = number * number;
        return res;
    }

    public static int getPower(int x, int y) {
        int res = 1;
        for (int i = 0; i < y; i++) {
            res *= x;
        }
        return res;
    }

    public static void main(String[] args) {
        // 메소드 오버로딩 = 같은 이름의 메소드를 여러번 선언
        // 1. 전달값이 타입이 다르거나
        // 2. 전달값의 갯수가 다르거나
        // 전달하는 자료형에 따라 메소드 이름이 같지만 각각 자료형이 다른 메소드를 각각 호출
        // 메소드 이름이 같아도 전달하는 인수 갯수가 달라다면 맞는 메소드를 호출
        int val = getPower(3);
        System.out.println(val);

        val = getPower("3");
        System.out.println(val);

        System.out.println(getPower(3, 3));

    }
}
