package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // switch case
        // 1등 전액 장학금, 2등 반액, 3등 반액장학금, 그 외 대상아님

        // if else문을 이용한 방법
        int ranking = 1;
        if (ranking == 1) {
            System.out.println("전액 장학금");
        } else if (ranking == 2 || ranking == 3) {
            System.out.println("반액 장학금");
        } else {
            System.out.println("대상 아님");
        }
        System.out.println("조회 완료1");

        // Switch Case문
        ranking = 4;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
                System.out.println("반액 장학금");
                break;
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료2");

        // case 2, 3을 통합
        ranking = 2;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2: // break문이 없기 때문에 2값이 들어오면 case3을 실행한다
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료3");

        // braek문이 없다면 case의 연산을 다 한다
        int grade = 1;
        int price = 7000;
        switch (grade) {
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade + "등급의 가격은 " + price);

        grade = 2;
        price = 7000;
        switch (grade) {
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade + "등급의 가격은 " + price);

        // 범위일 때 또는 여러 조건일 경우 if문을
        // 명확한 값일 때는 switch문을 사용할 수 있다
    }
}
