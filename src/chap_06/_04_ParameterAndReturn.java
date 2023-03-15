package chap_06;

public class _04_ParameterAndReturn {
    public static int getPower(int number) {
        int res = number * number;
        return res;
    }

    public static int getPowerByExp(int x, int y) {
        int res = 1;
        for (int i = 0; i < y; i++) {
            res *= x;
        }
        return res;
    }

    public static void main(String[] args) {
        // 전달값과 반환값이 있는 메소드
        int val = getPower(2);
        System.out.println(val);

        val = getPower(4);
        System.out.println(val);

        val = getPowerByExp(3, 3);
        System.out.println(val);
    }
}
