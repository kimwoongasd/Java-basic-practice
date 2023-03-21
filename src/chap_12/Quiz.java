package chap_12;

public class Quiz {
    public static void main(String[] args) {

        Runnable productA = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5 ; i++) {
                    System.out.println("A 상품 준비 " + i + "/5");
                }
                System.out.println("A 상품 준비 완료");
            }
        };

        Runnable productB = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("B 상품 준비 " + i + "/5");
            }
            System.out.println("B 상품 준비 완료");
        };

        Thread aThread = new Thread(productA);
        Thread bThread = new Thread(productB);
        aThread.start();
        bThread.start();

        // join이랑 다른 방법
        // isAlive()은 쓰레드가 알아있는지 살아있다면 true
        while (aThread.isAlive() || bThread.isAlive()) {

        }

        /*try {
            aThread.join();
            bThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/

        Runnable ready = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("세트 상품 포장 " + i + "/5");
            }
            System.out.println("세트 상품 포장 완료");
        };
        Thread threadReady = new Thread(ready);
        threadReady.start();

    }
}
