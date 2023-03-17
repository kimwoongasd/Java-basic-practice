package chap_07;

public class _01_Class {
    public static void main(String[] args) {
        // 객체 지향 프로그래밍 (OOP)
        // 유지보수 용이
        // 높은 재사용성

        // 차량용 블랙박스
        // 모델명, 해상도, 가격, 색상등 정보가 있다고 가정
        String modelName = "까망이";
        String resolution = "HD";
        int price = 20000;
        String color = "블랙";

        // 새 제품 개발
        String modelName2 = "노랑이";
        String resolution2 = "FHD";
        int price2 = 300000;
        String color2 = "yellow";

        // 중복된 데이터가 많다
        // 클래스로 부터 만들어지는 것을 객체라고 한다.
        // blackBox 클래스로부터 bbox 객체를 생성
        // bbox 객체는 BlockBox 클래스의 인스턴스
        BlackBox bbox = new BlackBox();
    }
}
