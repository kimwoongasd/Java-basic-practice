package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        /*
        변수 이름 짓는 법
        1. 저장할 값에 어울리는 이름
        2. 밑줄(_), 문자, 숫자 사용 가능 (공백 사용 불가)
        3. 밑줄 또는 문자로 시작 가능
        4. 한 단어 또는 2개 이상의 연속
        5. 소문자로 시작, 각 단어의 시작 글자는 대문자(첫 단어는 제외)
        6. 예약어 사용 불가(int, flout, public 등)
        */

        String nationality = "대학민국";
        String firtName = "김";
        String last_Name = "솜솜";
        String dateOfBirth = "2002-02-02";
        String residentialAddess = "시그니엘";
        String purposeOfVisit = "관광";
        String _flightNo = "kr02";
        String flight_no_2 = "kr0202";

        int lengthOfStay = 5;

        String item1 = "시계";
        String item_2 = "가방";

        // 절대 변하지 않는 상수는 대문자로
        final String CODE = "KR";
    }
}
