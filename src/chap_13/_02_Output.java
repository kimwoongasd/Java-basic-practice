package chap_13;

public class _02_Output {
    public static void main(String[] args) {
        // 출력
        // System.out.format("");
        // System.out.printf("포멧", 값1, 값2, 값3.....);

        System.out.println("----------정수----------");
        System.out.printf("%d%n", 1); // %n 줄바꿈
        System.out.printf("%d %d %d %n", 3, 2, 1);
        System.out.printf("%d%n", 123456);
        System.out.printf("%6d%n", 1234); // %6d 6자리 공간을 확보하고 1234를 출력
        System.out.printf("%06d%n", 1234); // 6자리 공간 확보 후 1234출력하는데 빈자리 0으로 채움
        System.out.printf("%6d%n", -1234); // _-1234
        System.out.printf("%+6d%n", 1234); // _+1234 항상 기호 표시
        System.out.printf("%,12d%n", 100000000); // _100,000,000 3자리 마다 ,(콤마)로 구분
        System.out.printf("%-6d%n", 1234); // 1234__ 6자리 공간 확보후 왼쪽 정렬


        System.out.println("----------실수----------");
        System.out.printf("%f%n", Math.PI);
        System.out.printf("%.2f%n", Math.PI); // 소수 2번째 자리까지
        System.out.printf("%6.2f%n", Math.PI); // 6자리 공간 확보 후 소수 2번째 자리까지
        System.out.printf("%6.2f%n", Math.PI); // 6자리 공간 확보 후 소수 2번째 자리까지
        System.out.printf("%06.2f%n", Math.PI); // 6자리 공간 확보 후 소수 2번째 자리까지 빈자리 0으로 채움
        System.out.printf("%+6.2f%n", Math.PI); // 6자리 공간 확보 후 소수 2번째 자리까지 +기호 붙이기

        System.out.println("----------문자열----------");
        System.out.printf("%s%n", "Java");
        System.out.printf("%6s%n", "Java"); // 6자리 공간 확보 오른쪽 정렬
        System.out.printf("%-6s%n", "Java"); // 6자리 공간 확보 왼쪽 정렬
        System.out.printf("%6.2s%n", "Java"); // 6자리 공간 확보, 앞에 2글자 출력
        System.out.printf("%-6.2s%n", "Java"); // 6자리 공간 확보 왼쪽 정렬 앞에 2글자 출력

        System.out.println("----------문자열 응용----------");
        System.out.println("이름 영어 수학 평균");
        System.out.printf("%s %d %d %.1f %n", "유재석", 90, 80, 85.0);

        System.out.println("----------문자열 응용2----------");
        System.out.println("이름      영어   수학    평균");
        System.out.printf("%-6s %4d %4d %6.1f %n", "이수근", 90, 80, 85.0);
        System.out.printf("%-6s %4d %4d %6.1f %n", "이수근", 100, 80, 85.0);
        System.out.printf("%-6s %4d %4d %6.1f %n", "이수근", 90, 100, 85.0);

    }
}
