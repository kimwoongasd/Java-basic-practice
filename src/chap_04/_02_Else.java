package chap_04;

public class _02_Else {
    public static void main(String[] args) {
        // 조건문 if else
        int i = 15;
        if (i < 14) {
            System.out.println("아아 + 1");
        } else { // 위 조건 외의 경우일 때
            System.out.println("디카페인 아아 +1");
        }
        System.out.println("커피 주문 완료");

        i = 10;
        boolean coffe = true;
        if (i >= 14 || coffe) {
            System.out.println("디카페인 아아 +1");
        } else {
            System.out.println("아아 +1");
        }
        System.out.println("커피 주문 완료");
    }
}
