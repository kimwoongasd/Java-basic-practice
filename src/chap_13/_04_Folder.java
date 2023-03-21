package chap_13;

import java.io.File;

public class _04_Folder {
    public static void main(String[] args) {
        // 폴더 다루기
        String folderName = "A";
        File folder = new File(folderName);
        folder.mkdir(); // 폴더 생성
        if (folder.exists()) {
            System.out.println("폴더가 존재합니다 " + folder.getAbsolutePath());
        }

        // 하위폴더
        // 상위 폴더 밑에 하위폴더 하나는 만들 수 있지만 하위폴더의 하위폴더는 못만든다
        folderName = "A/B/C";

        // "A" + File.separator + "B" + File.separator + "C"
        folder = new File(folderName);
        // mkdir -> mkdirs
        folder.mkdirs(); // 폴더 생성
        if (folder.exists()) {
            System.out.println("폴더가 존재합니다 " + folder.getAbsolutePath());
        } else {
            System.out.println("폴더 생성 실패 (mkdirs)");
        }
    }
}
