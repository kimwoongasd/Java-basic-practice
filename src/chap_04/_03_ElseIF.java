package chap_04;

public class _03_ElseIF {
    public static void main(String[] args) {
        // 조건문 else if
        boolean apple = true;
        boolean mango = true;

        if (apple) {
            System.out.println("사과 + 1");
        } else if (mango) {
            System.out.println("망고 + 1");
        } else {
            System.out.println("아아 + 1");
        }
        System.out.println("주문 완료");

        apple = false;
        mango = true;

        if (apple) {
            System.out.println("사과 + 1");
        } else if (mango) {
            System.out.println("망고 + 1");
        } else {
            System.out.println("아아 + 1");
        }
        System.out.println("주문 완료2");

        apple = false;
        mango = false;

        if (apple) {
            System.out.println("사과 + 1");
        } else if (mango) {
            System.out.println("망고 + 1");
        } else {
            System.out.println("아아 + 1");
        }
        System.out.println("주문 완료3");

        // else-if는 여러번 사용 가능
        apple = false;
        mango = false;
        boolean banana = true;

        if (apple) {
            System.out.println("사과 + 1");
        } else if (mango) {
            System.out.println("망고 + 1");
        } else if (banana) {
            System.out.println("바나나 + 1");
        } else {
            System.out.println("아아 + 1");
        }
        System.out.println("주문 완료4");
    }
}
