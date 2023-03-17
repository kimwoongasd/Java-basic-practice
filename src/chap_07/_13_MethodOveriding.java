package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _13_MethodOveriding {
    public static void main(String[] args) {
        // 메소드 오버라이딩 : 자식클래스에서 부모클래스의 메소드를 덮어쓰는 동작(재정의)
        // 메소드 오버로딩과 다르다
        // 메소드 오버로딩은 같은 클래슨내에서 같은 이름을 가진 메소드를 파라미터의 갯순나 타입을
        // 다르게 함으로써 여러개를 정의할 수 있다.

        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();
    }
}
