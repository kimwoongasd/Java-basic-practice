package chap_10;

public class _01_AnonymousClass1 {
    public static void main(String[] args) {
        // 익명 클래스
        Coffee c1 = new Coffee();
        c1.order("아메리카노");
        System.out.println("--------------");

        Coffee c2 = new Coffee();
        c2.order("라떼");
        System.out.println("--------------");

        // 익명 클래스
        // 객체 하나만을 위한, 일회성 코드
        Coffee specialCoffee = new Coffee() {
            @Override
            public void order(String coffee) {
                super.order(coffee);
                System.out.println("서비스입니다");
            }

            @Override
            public void returnTray() {
                System.out.println("내가 치울게");
            }
        };
        specialCoffee.order("아바라");
        specialCoffee.returnTray();

    }
}
class Coffee{
    public void order(String coffee) {
        System.out.println("주문하신 " + coffee + " 나왔습니다");
    }

    public void returnTray() {
        System.out.println("커피 반납완료");
    }
}