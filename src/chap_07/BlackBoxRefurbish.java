package chap_07;

// public 클래스를 사용한다면 클래스명이 자바파일 이름과 같아야한다
public class BlackBoxRefurbish {
    public String name; // 모델명
    String resolution; // 해상도
    private int price; // 가걱
    protected String color; //색

    // getter와 setter 편하게 만들기
    // 메뉴의 코드(c)에서 생성 -> getter 및 setter 선택
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResolution() {
        if (resolution == null || resolution.isEmpty()) {
            return "판매자에거 문의하세요";
        }
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price <= 50000) {
            this.price = 50000;
        } else {
            this.price = price;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

/*class A {

}*/
