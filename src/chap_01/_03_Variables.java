package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        // String name;
        // name = "솜솜이"
        // 아래 변수도 가능

        String name  = "솜솜이";

        int hour;
        hour = 7;

        System.out.println(name + "님 현재 시간은 " + hour + "시 입니다");
        System.out.println(name + "님");

        // 실수
        double score = 90.5;
        // 한글자일 때 char 사용, 작은 따음표 사용
        char grade = 'A';
        name = "강백호";
        System.out.println(name + "의 점수는" + score + "이고 학점은" + grade);

        // 블리언
        boolean pass = true;
        System.out.println(pass);

        // flout은 double만큰 정밀한 데이터를 못넣기 때문에 뒤에 f, F를 붙인다
        // 정밀한 소수 계산시 double 사용
        double d = 3.16;
        float f = 3.14f;
        System.out.println(d);
        System.out.println(f);

        d = 3.16123456789;
        f = 3.14123456789F;
        System.out.println(d);
        System.out.println(f);

        // int 범위 약 -21억 ~ + 21억
        // int보다 큰 범위 long, 뒤에 l, L입력
        long l = 1000000000000l;
        // _로 3칸씩 구분 가능
        l = 1_000_000_000_000L;
        System.out.println(l);
    }
}
