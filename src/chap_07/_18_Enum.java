package chap_07;

public class _18_Enum {
    public static void main(String[] args) {
        // 열거형 : 상수들의 묶음(고정된 값들)
        // 달략, 옷, 신발 사이즈 종류 등등

        Month month = Month.JUN;
        System.out.println(month);

        month = Month.APR;
        System.out.println(month);

        switch (month) {
            case APR:
                System.out.println("4월");
                break;
            case JAN:
                System.out.println("1월");
                break;
            case JUN:
                System.out.println("6월");
                break;
            case MAR:
                System.out.println("3월");
                break;
        }

        // 문자열로 값 가져오기
        month = Month.valueOf("MAR");
        System.out.println(month);

        // 반복문을 이용해 값 가져오기
        for (Month m : Month.values()) {
            // 값과 값은 순번(index)
            System.out.println(m.name() + " : " + m.ordinal());
        }

        for (Month m: Month.values()) {
            System.out.println(m.name() + " : " + m.getNum());
        }
    }
}

// 값들을 대문자로 정의
enum Month {
    JAN(1), MAR(3), APR(4), JUN(6);

    // 변수 만들기 (상수가 가지는 값을 정의)
    private final int num;
    Month(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}
