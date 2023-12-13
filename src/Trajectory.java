import java.util.ArrayList;
import java.util.List;

public class Trajectory {
    private List<TrajectoryPoint> points;
    private TrajectoryFile file;

    public Trajectory(TrajectoryFile file) {
        this.file = file;
        points = new ArrayList<>();
    }

    public void setPoints(List<TrajectoryPoint> points) {
        this.points.addAll(points);
    }

    public List<TrajectoryPoint> getTrajectory() {
        return points;
    }
}
