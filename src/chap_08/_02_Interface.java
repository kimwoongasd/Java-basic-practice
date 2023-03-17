package chap_08;

import chap_08.Camera.FactoryCam;
import chap_08.detector.AdvancedFireDetector;
import chap_08.detector.Detectable;
import chap_08.detector.FireDetector;
import chap_08.reporter.NormalReporter;
import chap_08.reporter.Reportable;
import chap_08.reporter.VideoReporter;

public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스 : 뼈대만 제공하는 구조
        // 단일상속 extends


        /*NormalReporter normalReporter = new NormalReporter();
        VideoReporter videoReporter = new VideoReporter();*/

        // Reportable로 변경해도 문제없음
        Reportable normalReporter = new NormalReporter();
        VideoReporter videoReporter = new VideoReporter();

        normalReporter.report();
        videoReporter.report();

        System.out.println("------------");

        FireDetector fireDetector = new FireDetector();
        AdvancedFireDetector advancedFireDetector = new AdvancedFireDetector();
        fireDetector.detect();
        fireDetector.detect();

        System.out.println("------------");


        FactoryCam factoryCam = new FactoryCam();
        // setter을 통해서 videoReporter와  advancedFireDetector의 기능을 그대로 사용한다
        factoryCam.setReporter(videoReporter);
        factoryCam.setDetector(advancedFireDetector);
        factoryCam.detect();
        factoryCam.report();
    }
}
