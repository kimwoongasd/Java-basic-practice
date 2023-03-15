package chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        // 아스키 코드 : 미국 표준 코드
        // 대문제 A는 65부터 시작
        // 소문자 a는 97 부터 시작
        // 숫자 0은 48 부터 시작
        char c = 'A';
        System.out.println(c);
        System.out.println((int)c);

        c = 'B';
        System.out.println(c);
        System.out.println((int)c);

        c++;
        System.out.println(c);
        System.out.println((int)c);

        c = 'a';
        System.out.println(c);
        System.out.println((int)c);

        c = 'b';
        System.out.println(c);
        System.out.println((int)c);

        c++;
        System.out.println(c);
        System.out.println((int)c);

        c = '0';
        System.out.println(c);
        System.out.println((int)c);

        c = '1';
        System.out.println(c);
        System.out.println((int)c);

        c++;
        System.out.println(c);
        System.out.println((int)c);

        String[][] seates2 = new String[10][15];
        char a = 'A';
        for (int i = 0; i < seates2.length; i++) {
            for (int j = 0; j < seates2[i].length; j++) {
                seates2[i][j] = String.valueOf(a) + (j + 1);
            }
            a++;
        }

        for (int i = 0; i < seates2.length; i++) {
            for (int j = 0; j < seates2[i].length; j++) {
                System.out.print(seates2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
