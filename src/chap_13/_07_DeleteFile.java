package chap_13;

import java.io.File;

public class _07_DeleteFile {
    public static void main(String[] args) {
        // 파일, 폴더 삭제
        File file = new File("test.txt");
        if (file.delete()) {
            System.out.println("파일 삭제 성공 : " + file.getName());
        } else {
            System.out.println("파일 삭제 실패 : " + file.getName());
        }

       file = new File("goodjob.txt");
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("파일 삭제 성공 : " + file.getName());
            } else {
                System.out.println("파일 삭제 실패 : " + file.getName());
            }
        }

        // 하위폴더가 있으면 상위폴더 삭제 불가능
        // 아래 코드는 맨 하위폴더 하나 삭제
        // File folder = new File("A/B/C");
        File folder = new File("A/");
        if (folder.exists()) {
            if (folder.delete()) {
                System.out.println("폴더 삭제 성공 " + folder.getAbsolutePath());
            } else {
                System.out.println("폴더 삭제 실패 " + folder.getAbsolutePath());
            }
        }

        if (deleteFolder(folder)) {
            System.out.println("*폴더 삭제 성공 " + folder.getAbsolutePath());
        } else {
            System.out.println("*폴더 삭제 실패 " + folder.getAbsolutePath());
        }
    }
    // 전체 폴더 삭제
    // 재귀를 통해서 맨 하위폴더 까지가서 삭제
    public static boolean deleteFolder(File folder){
        if (folder.isDirectory()) {
            for (File file : folder.listFiles()){
                deleteFolder(file);
            }
        }
        System.out.println("삭제 " + folder.getAbsolutePath());
        return folder.delete();
    }
}
