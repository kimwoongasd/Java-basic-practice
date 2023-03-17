package chap_07;

import chap_07.camera.Camera;

public class _16_Reference {
    public static void main(String[] args) {
        // 참조
        // 기본 자료형(Primitive Data Type) : int, float, double, long, boolean...은 기본으로 들어간는 값이 있다
        // boolean은 기본값 false
        // 기본 자료형은 메소드가 없다
        int[] i = new int[3];
        System.out.println(i[0]); // 0

        double[] d = new double[3];
        System.out.println(d[0]); // 0.0

        // 참조 자료형(Non-Primitive, Reference Data Types)
        // String, class로 만든 Camera, SpeedCam 등
        // 참조 자료형은 메소드가 있다
        String[] s = new String[3];
        System.out.println(s[0]); // null

        Camera[] c = new Camera[3];
        System.out.println(c[0]);
        System.out.println(c[0] == null);

        System.out.println("-------------");
        int a = 10;
        int b = 20;
        b = a;
        System.out.println(a);
        System.out.println(b);
        b = 30;
        System.out.println(b);

        System.out.println("-------------");

        // c1, c2 객체는 어딘가 만들어진 Camera()를 참조하고 있다
        Camera c1 = new Camera();
        Camera c2 = new Camera();

        c1.name = "카메라1";
        c2.name = "카메라2";
        System.out.println(c1.name);
        System.out.println(c2.name);

        c2 = c1;
        // c2가 c1를 참조하게 된다.
        // c1이 참조하는 new Camera()를 c2도 참조하게 된다.
        // c2값이 변하면 c2가 참조하는 c1의 new Camera()값이 변하고 c1의 참조하는 Camera()값도 변한다
        System.out.println(c1.name);
        System.out.println(c2.name);

        c2.name = "고장난 카메라";
        System.out.println(c1.name);
        System.out.println(c2.name);

        changeName(c2);
        System.out.println(c1.name);
        System.out.println(c2.name);

        // 관계를 끊을 때
        c2 = null;
        System.out.println(c1.name);

//        System.out.println(c2.name);
    }

    public static void changeName(Camera camera){
        camera.name = "잘못된 카메라";
    }
}
