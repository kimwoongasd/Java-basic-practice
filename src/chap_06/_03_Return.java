package chap_06;

public class _03_Return {
    // void로 적으면 아무것도 반환하지 않는 메소드
    // return을 쓰려면 반환할 값을 문자열, 정수형등 정의 해야하고 return값이 같은 형태이어야 한다
    public static String getPhoneNumber() {
        String number = "02-1234-1234";
        return number;
    }

    public static String getAddres() {
        return "서울시";
    }

    public static String getActivity() {
        return "볼링장, 탁구장, 수영장";
    }

    public static void main(String[] args) {
        // return 반환값
        String phone_number = getPhoneNumber();
        System.out.println("전화번호 " + phone_number);

        String address = getAddres();
        System.out.println("주소는" + address);

        System.out.println("놀거리는 " + getActivity());
    }
}
