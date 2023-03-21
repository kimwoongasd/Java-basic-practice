package chap_12;

import chap_12.clean.CleanRunnable;

public class _02_Runnable {
    public static void main(String[] args) {
        // 쓰레드와 비슷
        // 인터페이스로 상속
        // 둘의 차이 쓰레드는 쓰레드 클래스를 상속, Runnable은 인터페이스를 구현
        // 상속은 하나만 상속가능, 복수 상속이 안되기 때문에 쓰레드 대신 Runnable 를 사용
        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable);
        thread.start();
        cleanByBoss();
    }

    public static void cleanByBoss() {
        System.out.println("사장 청소 시작");
        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i + "번방 사장 청소중");
        }
        System.out.println("사장 청소 끝");
    }
}
