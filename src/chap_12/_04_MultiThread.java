package chap_12;

public class _04_MultiThread {
    public static void main(String[] args) {
        // 복수의 쓰레드

        // 익명클래스
        Runnable cleaner1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("직원1 청소 시작");
                for (int i = 1; i <= 10; i += 2) {
                    System.out.println(i + "번방 직원 1 청소중");
                    try {
                        // 지정한 시간만큼 정지한다
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("직원1 청소 끝");
            }
        };

        // 람다를 이용한 쓰레드
        Runnable cleaner2 = () -> {
            System.out.println("직원2 청소 시작");
            for (int i = 2; i <= 10; i += 2) {
                System.out.println(i + "번방 직원2 청소중");
                try {
                    // 지정한 시간만큼 정지한다
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("직원2 청소 끝");
        };

        Thread cleaner1Thread = new Thread(cleaner1);
        Thread cleaner2Thread = new Thread(cleaner2);
        cleaner1Thread.start();
        cleaner2Thread.start();
    }
}
