package chap_12.clean;

// 쓰레드를 쓰기 위해서 쓰레드 클래스 상속해야한다
public class CleanThread extends Thread{
    public void run() {
        System.out.println("직원 청소 시작 Thread");
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i + "번방 청소중 Thread");
        }
        System.out.println("직원 청소 끝 Thread");

    }
}
