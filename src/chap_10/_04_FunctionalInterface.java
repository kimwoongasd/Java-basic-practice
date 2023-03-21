package chap_10;

import chap_10.converter.*;

public class _04_FunctionalInterface {
    public static void main(String[] args) {
        // 람다식
        KRWConverter converter = new KRWConverter();
//        converter.convert(1);

//        convertUSD(converter, 2);

        convertUSD((USD) -> System.out.println(USD + " 달러 = " + (USD * 1400) + "원"), 5);

        // 함수형 인터페이스
        Convertible convertible = (USD) -> System.out.println(USD + " 달러 = " + (USD * 1400) + "원");
        convertUSD(convertible, 1);

        // 전달값이 없다면?
        ConvertibleWithNoParams c1 = () -> System.out.println("1달러는 1400원");
        c1.convert();
        
        // 두줄이상의 코드
        c1 = () -> {
            int USD = 3;
            int KRW = 1400;
            System.out.println(USD + " 달러 = " + (USD * 1400) + "원");
        };
        c1.convert();

        // 전달값이 두 개인경우
        ConvertibleWithTwoParams c2 = (d, w) -> System.out.println(d + " 달러 = " + (d * w) + "원");

        c2.convert(10, 1500);

        // 반환값이 있는 경우
        ConvertibleWithReturn c3 = (d, w) -> d * w;
        int res = c3.convert(20, 1400);
        System.out.println(res + "원");
    }

    public static void convertUSD(Convertible converter, int USD) {
        converter.convert(USD);
    }
}
// 인터페이스에는 하나의 추상메소드가 존재햐아한다 2개 이상은 오류