package chap_07.camera;

// Carmera의 자식 클래스
public class SpeedCam extends Camera {
    public SpeedCam() {
        super("과속닥속 카메라");
    }

    public void checkSpeed() {
        // 속도 체크
        System.out.println("속도를 측정합니다");
    }

    public void recognizeLicensePlate() {
        // 번호 인식
        System.out.println("번호판 인식");
    }

    // 이 소스코드를 컴퓨터가 알아볼수 있는 형태로 바꾸는 것을 컴파일 그 역할을 하는게 컴파일러
    @Override // annotation(주석) 평소 쓰는 주석이랑 다르다
    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 속도 측정, 번호 인식");
    }

    public void takePicture() {
        // 사진 촬영
        // 중복된 부분을 사용, 상속을 하는 의미가 없어짐
        // System.out.println(this.name + " 사진을 촬영합니다.");
        super.takePicture();
        checkSpeed();
        recognizeLicensePlate();
    }
}
