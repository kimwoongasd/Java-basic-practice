package chap_12;

import chap_12.clean.CleanThread;

public class _01_Thread {
    public static void main(String[] args) {
        // 쓰레드 
        // 프로그램(ex) 계산기)을 실행하고 실행되고 있는 상태를 프로세스라고 표현한다
        // 프로세스의 자원을 이용해서 작업을 수햇하는 것을 쓰레드 라고한다
        // 하나의 프로세스는 복수의 쓰레드를 가질 수 있다.
        // 따로 처리하지 않으면 일반적으로 하나의 프로세스는 하나의 쓰레드를 갖는다

        // cleanBySelf();

        // 쓰레드 생성
        CleanThread cleanThread = new CleanThread();
        // run 메소드를 직접 호출해서 Thread안에있는 run 메소드를 수행하는것 뿐이다
        // cleanThread.run();
        cleanThread.start();
        cleanByBoss();

        // 출력문이 차례대로 나오지 않고 섞었다. - 쓰레드를 사용했기때문에 동시에 여러일을 처리함
    }

    public static void cleanBySelf() {
        System.out.println("혼자서 청소 시작");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "번방 혼자 청소중");
        }
        System.out.println("혼자 청소 끝");
    }

    public static void cleanByBoss() {
        System.out.println("사장 청소 시작");
        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i + "번방 사장 청소중");
        }
        System.out.println("사장 청소 끝");
    }
}
