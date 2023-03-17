package chap_07;
import java.util.Random;

public class _11_Package {
    public static void main(String[] args) {
        // 패키지 (랜덤 클래스)
        Random random = new Random();
        // int의 범위 내에서 정수형 값 반환
        System.out.println(random.nextInt());

        // 원하는 범위내에서 반환
        // 0 이상 10미만의 정수
        System.out.println(random.nextInt(10));

        // 0.0 이상 1.0미만의 실수값
        System.out.println(random.nextDouble());
        // double은 범위지정 불가
        // System.out.println(random.nextDouble());

        // 5.0이상 10.0미만 실수를 뽑으려면?
        double min = 5.0;
        double max = 10.0;
        System.out.println((min + (max - min) * random.nextDouble()));

        System.out.println(random.nextBoolean());

        // 로또 번호 랜덤으로 뽑으려면? 1~45
        System.out.println(random.nextInt(45) + 1);
    }
}
