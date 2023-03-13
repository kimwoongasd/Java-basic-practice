package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean a = true;
        boolean b = true;
        boolean c = true;

        // || = or(또는) 하나라도 참이면 true
        System.out.println(a || b || c);
        a = false;
        b = false;
        c = false;
        System.out.println(a || b || c);

        // && = and(그리고) 모두 참이면 true
        a = true;
        b = true;
        c = true;
        System.out.println(a && b && c);

        a = false;
        System.out.println(a && b && c);

        // 1 < 5 < 6 이런식은 안됨 1 < 5 , 5 < 6 나눠어야 한다
        System.out.println((5 > 3) &&( 3 >1));
        System.out.println((1 < 3) && (3 < 5));
        System.out.println((1 < 4) && (4 < 1));
        System.out.println((1 < 5) || (5 < 1));
        System.out.println((3 < 1) || (0 > 5));

        // 논리 부정 연산자
        // !를 블리언앞에 붙이면 반대 값이 나온다
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(!(5 == 5));
        System.out.println(!(5 == 3));
    }
}
