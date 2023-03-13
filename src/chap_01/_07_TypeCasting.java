package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        /*
        형변환
        정수형에서 실수형으로
        실수형에서 정수형으로
        */

        // 정수를 실수로
        int score = 93;
        System.out.println(score);
        System.out.println((float) score);
        System.out.println((double) score);

        // 실수에서 정수로
        float f = 93.3f;
        double d = 98.8;
        System.out.println((int) f);
        System.out.println((int) d);

        // 정수 + 실수 연산
        score = score + (int)d;
        System.out.println(score);
        // 실수변수에 정수를 더하면 저절로 실수로 변경되어서 실행
        d = d + 93;
        System.out.println(d);

        // 변수에 형변환된 데이터 집어넣기
        double tem = score; // 191 -> 191.0
        System.out.println(tem);

        // int -> long -> float -> double 점점 큰 범위로 갈때 자동으로 형변환
        // double -> float -> long -> int 수동으로 형변환 후 계산해야한다

        // 숫자를 문자열로
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1);

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(89.8);
        System.out.println(s2);

        // 문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i);
        double dd = Double.parseDouble("98.8");
        System.out.println(dd);
    }
}
