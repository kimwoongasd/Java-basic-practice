package chap_05;

public class _03_MultiArray {
    public static void main(String[] args) {
        // 다차원 배열 2차원

        String[] seatA = {"A1", "A2", "A3", "A4", "A5"};
        String[] seatB = {"B1", "B2", "B3", "B4", "B5"};
        String[] seatC = {"C1", "C2", "C3", "C4", "C5"};

        // 3 x 5 크기의 2차원 배열 선언
        String[][] seat = new String[][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"},
        };

        // B2에 접근
        System.out.println(seat[1][1]);
        // C5에 접근
        System.out.println(seat[2][4]);

        String[][] seates = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"},
        };
        // A3에 접근
        System.out.println(seates[0][2]);

        // 차원 배열 만들기
        String[][][] arr = new String[][][] {
                {{"A1", "A2", "A3"}, {"A1", "A2", "A3"}, {"A1", "A2", "A3"}},
                {{"A1", "A2", "A3"}, {"A1", "A2", "A3"}, {"A1", "A2", "A3"}},
                {{"A1", "A2", "A3"}, {"A1", "A2", "A3"}, {"A1", "A2", "A3"}},
        };

        System.out.println(arr[0][0][1]);
    }
}
