package chap_05;

public class _04_MultiArrayLoop {
    public static void main(String[] args) {
        // 다차원 배열 순회
        String[][] seates = {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"},
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(seates[i][j] + " ");
            }
            System.out.println();
        }

        String[][] arr = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"},
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (String[] x: arr) {
            for (String y: x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }


        String[][] seates2 = new String[10][15];
        String[] eng = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

        for (int i = 0; i < seates2.length; i++) {
            for (int j = 0; j < seates2[i].length; j++) {
                seates2[i][j] = eng[i] + (j + 1);
            }
        }
        seates2[7][8] = "XX";
        seates2[7][9] = "XXX";

        for (int i = 0; i < seates2.length; i++) {
            for (int j = 0; j < seates2[i].length; j++) {
                System.out.print(seates2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
