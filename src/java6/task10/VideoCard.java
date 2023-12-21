package java6.task10;

import java.util.Scanner;

// видеокарта
public class VideoCard implements Product {

    private int videoChipOperatingFrequency;
    private int videoMemoryCapacity;
    private int maximumMemoryBandwidth;

    // коструктор
    VideoCard(int videoChipOperatingFrequency, int videoMemoryCapacity, int maximumMemoryBandwidth) {
        this.videoChipOperatingFrequency = videoChipOperatingFrequency;
        this.videoMemoryCapacity = videoMemoryCapacity;
        this.maximumMemoryBandwidth = maximumMemoryBandwidth;
    }

    public VideoCard(Scanner scanner) {
        enterPerformance(scanner);
    }

    // в строку
    @Override
    public String toString() {
        return "VideoCard{" +
                "videoChipOperatingFrequency=" + videoChipOperatingFrequency +
                ", videoMemoryCapacity=" + videoMemoryCapacity +
                ", maximumMemoryBandwidth=" + maximumMemoryBandwidth +
                '}';
    }

    @Override
    public void enterPerformance(Scanner scanner) {
        System.out.println("Enter video cart data:");
        System.out.print("videoChipOperatingFrequency=");
        videoChipOperatingFrequency = scanner.nextInt();
        System.out.print("videoMemoryCapacity=");
        videoMemoryCapacity = scanner.nextInt();
        System.out.print("maximumMemoryBandwidth=");
        maximumMemoryBandwidth = scanner.nextInt();
    }

    public boolean compareTo(VideoCard o) {
        return o.videoChipOperatingFrequency <= videoChipOperatingFrequency & o.videoMemoryCapacity <= videoMemoryCapacity & o.maximumMemoryBandwidth <= maximumMemoryBandwidth;
    }
}
