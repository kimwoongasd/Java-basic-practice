package chap_12;

import chap_12.clean.CleanRunnable;

public class _03_Join {
    public static void main(String[] args) {
        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable);
        thread.start();

        try {
            // join은 이 코드가 끝날때까지 기다렸다가 다음으로 넘어간다
            thread.join(2500); // 2.5초 대기
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        cleanByBoss();
    }

    public static void cleanByBoss() {
        System.out.println("사장 청소 시작");
        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i + "번방 사장 청소중");
            try {
                // 지정한 시간만큼 정지한다
                Thread.sleep(1000); // 1초 대기
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("사장 청소 끝");
    }
}
