package chap_07.camera;


// Carmera의 자식 클래스
public class FactoryCam extends Camera {

    public FactoryCam() {
        super("공장 카메라");
    }

    public void detecFire() {
        // 화재 감지
        System.out.println("화재 감지합니다");
    }

    // 메소드 오버라이딩
    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 화재 감지");
    }

    public void recordVideo() {
        // 동영상 촬영
        super.recordVideo();
        detecFire();
    }
}
