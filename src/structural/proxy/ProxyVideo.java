package structural.proxy;

public class ProxyVideo implements Video {
    private RealVideo realVideo;
    private final String path;

    public ProxyVideo(String path) {
        this.path = path;
    }

    @Override
    public void watch() {
        if (realVideo == null) {
            realVideo = new RealVideo(path);
        }
        realVideo.watch();
    }
}
