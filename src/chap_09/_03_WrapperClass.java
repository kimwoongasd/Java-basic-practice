package chap_09;

public class _03_WrapperClass {
    public static void main(String[] args) {
        // 래퍼 클래서
        // int, double, float, char 기본자료형을 객체형으로 만듬
        // Integer, Float, Character, Double

        Integer i = 123;
        Double d = 1.0;
        Character c = 'A';

        System.out.println(i);
        System.out.println(d);
        System.out.println(c);

        System.out.println("-------------");
        // 래퍼 클래스의 메소드
        System.out.println(i.intValue());
        System.out.println(d.intValue()); // 실수를 정수로
        System.out.println(c.charValue());

        System.out.println("-------------");

        String s = i.toString();
        System.out.println(s);
    }
}
