package chap_13;

import java.io.*;

public class _06_ReadWriteFile {
    public static void main(String[] args) {
        // 파일 읽고 쓰기
        // BufferedReader : 파일에서 내용을 읽어올 때
        // BufferedWrite : 파일에서 내용을 쓸 때
        // Buffered = 데이터를 한곳에서 다른곳으로 보내는 과정에서 잠기 보관하는 장소

        // 파일쓰기
        /*try(BufferedWriter bw = new BufferedWriter(new FileWriter("goodjob.txt", true))) {
            // 내용이 덮어쓰기가 된다
            bw.write("1. 이제 거의 끝이 보여. \n");
            bw.newLine(); // 줄 바꿈
            bw.write("2. 잘 배우고 갑니다");
            bw.newLine();
            bw.write("정상이 코 앞이야");
        } catch (IOException e) {
            throw new RuntimeException(e);*/

        // 파일 읽기
        try (BufferedReader br = new BufferedReader(new FileReader("goodjob.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
