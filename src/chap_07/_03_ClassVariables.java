package chap_07;

import java.util.concurrent.BlockingDeque;

public class _03_ClassVariables {
    public static void main(String[] args) {
        // 클래스 변수
        BlackBox b1 = new BlackBox();
        b1.name = "까망이";
        System.out.println(b1.name);

        BlackBox b2 = new BlackBox();
        b2.name = "하양이";
        System.out.println(b2.name);
        
        // 특정 범위를 초과하는 충돌 감지시 신고
        System.out.println("개발 전");
        System.out.println(b1.name + "자동 신고 기능 : " + b1.conAutoReport);
        System.out.println(b2.name + "자동 신고 기능 : " + b2.conAutoReport);
        System.out.println(BlackBox.conAutoReport);

        BlackBox.conAutoReport = true;
        System.out.println("개발 후");
        System.out.println(b1.name + "자동 신고 기능 : " + b1.conAutoReport);
        System.out.println(b2.name + "자동 신고 기능 : " + b2.conAutoReport);
        System.out.println(BlackBox.conAutoReport); // 권장하는 방식

    }
}
