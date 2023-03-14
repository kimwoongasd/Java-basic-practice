package chap_04;

public class _01_if {
    public static void main(String[] args) {
        // 조건문 IF
        int hour = 10;
        if (hour < 14)
            System.out.println("아이스 아메리카노");
        System.out.println("커피 주문 완료");
        // if문 내에서 하나의 문장을 쓴다면 {} 생략 가능
        // 복수의 문장을 쓴다면 {}로 묶어야 한다.
        hour = 15;
        if (hour > 14) {
            System.out.println("아아");
            System.out.println("샷 추가");
        }
        System.out.println("커피 주문 완료");

        hour = 10;
        boolean mornungCoffe = false;
//        if (hour < 14 && mornungCoffe == false) {
        if (hour < 14 && !mornungCoffe) { // 위 코드와 같은 내용
            System.out.println("아아 +1");
        }

        hour = 16;
        mornungCoffe = true;
//        if (hour >= 14 || mornungCoffe == true) {
        if (hour >= 14 || mornungCoffe) { // 위 코드와 같은 내용
            System.out.println("디카페인 아아 +1");
        }
    }
}
