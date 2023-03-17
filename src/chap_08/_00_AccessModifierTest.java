package chap_08;

import chap_07.BlackBoxRefurbish;

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        // 접근 제어자
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.name = "까망이"; // public : 모든 클래스에서 접근 가능
        // b1.resolution = "FHD"; // default : 같은 패키지에서만 접근 가능
        // b1.price = 200000; // private
        // b1.color = "블랙"; // protected

        // A a = new A(); // public이 아니기 때문에 접근 불가능

    }
}
