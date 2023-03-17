package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _14_Polymorphism {
    public static void main(String[] args) {
        // 다형성

        // class Person : 사람
        // class Student extends Person : 학생 (학생은 사람이다)
        // class Teacher extends Person : 선생님 (선생님은 사람이다)

        /*Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();*/

        // 다형성 이용: 자식클래스 이름대신 부모클래스 이름으로 형태가 서로 다른 객체를 형성가능
        Camera camera = new Camera();
        Camera factoryCam = new FactoryCam();
        Camera speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

        System.out.println("-------------");
        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for (Camera cam: cameras) {
            cam.showMainFeature();
        }

        System.out.println("-------------");

        // 오류 나는 이유는 정의할 떄 Camera클래스(부모)로 했기 때문이다
        // 그렇기 때문에 부모클래스에 있는 메소드만 사용가능
        // speedCam.checkSpeed();
        // factoryCam.detecFire();

        // 위 오류를 해결하는 방법 = 형변환을 통해서 메소드에 접근
        // instanceof를 사용 : 이 객체가 어떤 클래스의 객체인지 확인
        if (camera instanceof Camera) { // camera의 객체가 Camera로 부터 만들어진 객체라면
            System.out.println("카메라입니다");
        }

        if (factoryCam instanceof FactoryCam) { // factoryCam이 FactoryCam의 인스턴스인지
            ((FactoryCam)factoryCam).detecFire();
        }

        if (speedCam instanceof SpeedCam) {
            ((SpeedCam)speedCam).checkSpeed();
            ((SpeedCam) speedCam).recognizeLicensePlate();
        }

        // 자바는 기본적으로 Object라는 클래스를 상속
        // 어떤 객체든 모든 클래스 객체를 넣을 수 있다
        Object[] obj = new Object[3];
        obj[0] = new Camera();
        obj[1] = new SpeedCam();
        obj[2] = new FactoryCam();
    }
}
