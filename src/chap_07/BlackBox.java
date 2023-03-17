package chap_07;

public class BlackBox {
    // 인스턴스 변수들
    String name; // 모델명
    String resolution; // 해상도
    int price; // 가걱
    String color; //색
    int serialNumber; // 시리얼 번호

    static int counter = 0; // 시리얼 번호를 생성해주는 역활(초기값이 0에서 ++을 통해 증가)

    // static을 붙이면 클래스 변수라고 한다
    // 만들어지는 모든 객체에 자동이로 적용
    // 클래스 변수는 클래스이름.변수로 접근
    // 자동신고 기능
    static boolean conAutoReport = false;

    // 생성자는 인스턴스 변수 다음에 적는다
    /*BlackBox() {
        System.out.println("기본 생성자 호출");
        this.serialNumber = ++counter;
        System.out.println("새로운 시리얼 넘버를 발급받았습니다 " + this.serialNumber);
    }

    BlackBox(String name, String resolution, int price, String color) {
        this(); // 기본 생성자를 가르킨다, 기본생성자를 수행하고 아래 코드 수행

        System.out.println("사용자 정의 생성자 호출");
        this.name = name;
        this.resolution = resolution;
        this.price = price;
        this.color = color;
    }*/

    // 클래스 내에서 기능을 만들어 사용할 수 있다

    // 간단한 메소드
    void autoReport() {
        if (conAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고");
        } else {
            System.out.println("신고 기능이 지원되지 않습니다");
        }
    }

    void insertMemoryCard(int capacity) {
        System.out.println(capacity + "GB 메모리 카드 삽입");
    }

    int getVideoFileCount(int type) {
        if (type == 1) {
            return 9;
        } else if (type == 2) {
            return 1;
        }
        return 10;
    }

    // 날짜, 속도, 분을 나타낸다
    void record(boolean showDatetime, boolean showspeed, int min) {
        System.out.println("녹화 시작");
        if (showDatetime) {
            System.out.println("영상에 날짜 정보 표시");
        }
        if (showspeed) {
            System.out.println("영상에 속도가 표시");
        }
        System.out.println("영상 기록 단위 " + min + "분");
    }

    // record메소드가 호출될 때 기본적으로 정의된 값을 준다
    // 메소드 오버로딩
    void record() {
        record(true, true, 5);
    }

    // 클래스 변수를 만들때 처럼 static 붙인다
    // static으로 선언한 클래스 변수는 클래스 메소드에서 사용가능
    // 인스턴스과 같이 naem변수는 직접 접근 불가능
    static void callServieCenter() {
        System.out.println("서비스 센터(1111-1111)로 연결됩니다.");
        // name = "test";
        // conAutoReport = true;
    }

    void appendName(String name) {
        // 파라미터와 인스턴스 변수 이름이 같으면 적용이 안된다.
        // 구분하기 위해서 this.를 붙인다
        // 클래스의 인스턴스 변수인 것을 접근하려면 this.를 붙인다
        this.name += name;
    }

    // Getter는 값을 가져오는 메소드
    // Setter는 값을 설정하는 메소드
    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getResolution() {
        if (resolution == null || resolution.isEmpty()) {
            return "판매자에거 문의하세요";
        }
        return resolution;
    }

    void setResolution(String resolution) {
        this.resolution = resolution;
    }

    int getPrice() {
        return price;
    }

    void setPrice(int price) {
        if (price <= 50000) {
            this.price = 50000;
        } else {
            this.price = price;
        }
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

}
