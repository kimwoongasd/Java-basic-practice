package chap_07;

public class quiz {
    public static void main(String[] args) {
        // 내 코드
        /*Hamburger hamburger = new Hamburger();
        CheeseHamburger cheeseHamburger = new CheeseHamburger();
        ShrimpHamburger shrimpHamburger = new ShrimpHamburger();

        hamburger.cook();
        cheeseHamburger.cook();
        shrimpHamburger.cook();*/

        Hamburger[] hamburgers = new Hamburger[3];
        hamburgers[0] = new Hamburger();
        hamburgers[1] = new CheeseHamburger();
        hamburgers[2] = new ShrimpHamburger();

        for (Hamburger hamburger : hamburgers) {
            hamburger.cook();
            System.out.println("-------------");
        }
    }
}

class Hamburger {
    public String name;

    public Hamburger() {
        this("함버거");
    }

    public Hamburger(String name) {
        this.name = name;
    }

    public void cook() {
        System.out.println(this.name + "의 재료 성분");
        System.out.println("양상추");
        System.out.println("+ 피클");
        System.out.println("+ 패티");
    }
}

// 내 코드
class CheeseHamburger extends Hamburger {
    public CheeseHamburger() {
        super("치즈버거");
    }

    public void cook() {
        super.cook();
        System.out.println("+ 치즈");
    }
}

class ShrimpHamburger extends Hamburger {
    public ShrimpHamburger() {
        super("새우버거");
    }

    public void cook() {
        super.cook();
        System.out.println("+ 새우");
    }
}
