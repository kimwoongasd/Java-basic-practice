package chap_08;

import chap_08.Camera.Camera;
import chap_08.Camera.FactoryCam;
import chap_08.Camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // abstract
        // 추상화 클래스 : 아직 완성되지 않은 클래스 - 객체로 만들 수 없다
        // 추상 매소드 : 추상클래스 또는 인터페이스에서만 사용 가능, 껍데기만 있는 메소드
        // 데이터 추상화 : 몰라도 되는 부분은 숨기고 필요한 부분만 공개하는 과정

        // abstract이며 인스턴스화 할 수 없다, 추상클래스이기 때문에 객체 생성 불가능
        // Camera camera = new Camera();

        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        factoryCam.showMainFeature();
        speedCam.showMainFeature();
    }
}
