package chap_07;

public class _04_Method {
    public static void main(String[] args) {
        // 메소드
        BlackBox b1 = new BlackBox();
        // 클래스내의 메소드 호출
        b1.autoReport();

        BlackBox.conAutoReport = true;
        b1.autoReport();

        b1.insertMemoryCard(256);

        // 일반 영상 : 1
        // 이벤트 영상 : 2
        int fileCount = b1.getVideoFileCount(1);
        System.out.println("일반 영상 파일 수 " + fileCount);

        fileCount = b1.getVideoFileCount(2);
        System.out.println("이벤트 영상 파일 수 " + fileCount);
    }
}
