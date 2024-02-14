package structural.proxy;

public class RealVideo implements Video {
    private final String path;

    public RealVideo(String path) {
        this.path = path;
        load();
    }

    private void load() {
        System.out.println("load " + path);
    }

    @Override
    public void watch() {
        System.out.println("watch " + path);
    }
}
