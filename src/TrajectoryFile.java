public class TrajectoryFile {
    private String path;
    private String name;
    private String format;

    public TrajectoryFile(String path, String name, String format) {
        this.path = path;
        this.name = name;
        this.format = format;
    }

    public String getPath() {
        return this.path;
    }

    public String getName() {
        return this.name;
    }

    public String getFormat() {
        return this.format;
    }
}
