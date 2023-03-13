package chap_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        // 삼항 연산자 == 조건 연산자
        // 결과 = 조건 ? (참일 경우 결과값) : (거짓 결과값)
        int x = 5;
        int y = 3;
        // x 가 y보다 크다면 x 작다면 y
        int max = (x > y) ? x : y;
        System.out.println(max);
        x = 3;
        y = 5;
        int m = (x > y) ? x : y;
        System.out.println(m);

        x = 1;
        y = 3;
        int min = (x < y) ? x : y;
        System.out.println(min);

        boolean b = (x == y) ? true : false;
        System.out.println(b);

        String s = (x != y) ? "달라요" : "같아요";
        System.out.println(s);

    }
}
