package chap_10;

public class _02_AnonymousClass2 {
    public static void main(String[] args) {
        // 익명클래스
        HomeMadeBurger momMadeBurger = getMomMadeBurger();
        momMadeBurger.cook();
        System.out.println("-----------------");

        HomeMadeBurger broMadeBurger = getBroMadeBurger();
        broMadeBurger.cook();
    }

    private static HomeMadeBurger getBroMadeBurger() {
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 군데리아");
            }
        };
    }

    // 추상 클래스를 상속해서 cook이라는 메소드를 정의하는거 같이 행동
    public static HomeMadeBurger getMomMadeBurger() {
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("집에서 먹는 수제버거");
                System.out.println("불고기버거");
            }
        };
    }
}

// 추상클래스
abstract class HomeMadeBurger {
    public abstract void cook();
}