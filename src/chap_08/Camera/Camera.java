package chap_08.Camera;

// 추상 클래스 생성
public abstract class Camera {
    public void takePicture() {
        System.out.println("사진을 촬영합니다.");
    }

    public void recordVideo() {
        System.out.println("동영상을 녹화합니다.");
    }

    // 추상 메소드 생성 - 이름을 적고 메소드 선언후 ;
    public abstract void showMainFeature(); // 구현해야 하는 메소드
}
