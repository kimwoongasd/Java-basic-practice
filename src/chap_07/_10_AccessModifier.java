package chap_07;

public class _10_AccessModifier {
    public static void main(String[] args) {
        // 캡슐화
        // 정보은닉

        // 접근 제어자
        // private : 해당 클래스 내에서만 접근 가능
        // public : 모든 클래스에서 접근 가능
        // default : 아무것도 적지 않았을 때 같은 패키지 내에서만 접근 가능
        // protected : 같은 패키지 내에서 그냥 가능, 다른 패키지인 경우 자식 클래스에서 접근 가능
        // getter, setter도 앞에 접근 제어자에 따른다
        // 클래스에서도 접근제어자 사용가능
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.name = "까망이";
        // b1.resolution = "FHD";
        // b1.price = 200000; 클래스에서 인스턴스 변수앞에 private을 입력해서 오류가 난다
        b1.setPrice(200000);
        b1.color = "블랙";

        // 할인 행사
        b1.setPrice(-6000); // 잘못입력
        // System.out.println(b1.price); 클래스에서 인스턴스 변수앞에 private을 입력해서 오류가 난다
        System.out.println(b1.getPrice());

        // 값이 없으면 null이 나온다
        System.out.println(b1.resolution);
        System.out.println("------------------");

        BlackBoxRefurbish b2 = new BlackBoxRefurbish();
        b2.setName("하양이");
        b2.setPrice(-5000);
        b2.setColor("화이트");

        System.out.println(b2.getPrice());
        System.out.println(b2.getResolution());
    }
}
