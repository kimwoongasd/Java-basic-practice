package chap_12;

import chap_12.clean.Room;

public class _05_Synchronization {
    public static void main(String[] args) {
        // 동기화
        // 여러 쓰레드에서 하나의 변수에 접근해서 업데이트하면 중복될 수 있다
        // 다른 쓰레드에서 오류가나도 다른 쓰레드도 문제가 있는게 아니다
        Room room = new Room();

        Runnable cleaner1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("직원1 청소 시작");
                for (int i = 1; i <= 5; i++) {
                    room.clean("직원1");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    if (i == 2) {
                        throw new RuntimeException("힘들다");
                    }
                }
                System.out.println("직원1 청소 끝");
            }
        };

        Runnable cleaner2 = () -> {
            System.out.println("직원2 청소 시작");
            for (int i = 1; i <= 5; i++) {
                room.clean("직원2");

                try {
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
