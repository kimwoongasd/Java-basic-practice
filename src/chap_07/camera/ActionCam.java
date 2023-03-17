package chap_07.camera;


// 상속을 못하게 final
public final class ActionCam extends Camera {
    // 렌즈를 바꾸지 못하게 하는 방법
    // public final String lens = "광각렌즈";
    public final String lens;

    // final를 추가해서 직접 값을 처리하는 경우도 있고 생성자를 총해서 처리하는 방법도 있다
    public ActionCam() {
        super("액션 카메라");
        lens = "광각렌즈";
    }

    public final void makeVideo() {
        System.out.println(this.name + " : " + this.lens + " 비디오 제작합니다");
    }
}
