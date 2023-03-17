package chap_07.camera;
// ActionCam이 final이라 상속 불가능
//public class SlowActionCam extends ActionCam {
public class SlowActionCam {
    public String name;

    public SlowActionCam() {
        this.name = "슬로우 액션 카메라";
    }

    public final void makeVideo() {
        System.out.println(this.name + " :  슬로우 비디오 제작합니다");
    }

    // 부모 클래스의 메소드가 final를 가지고있기 때문에 오버라이딩 불가능
    /*public void makeVideo() {
        System.out.println(this.name + " : " +
                this.lens + " 슬로우모드 비디오 제작합니다");
    }*/

    public void recordVideo() {
        // 동영상 촬영
        System.out.println(this.name + " 동영상을 녹화합니다.");
    }
}
