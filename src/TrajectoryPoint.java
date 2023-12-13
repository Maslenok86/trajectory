public class TrajectoryPoint {
    private double T;
    private double X;
    private double Y;
    private double Z;
    private double Vx;
    private double Vy;
    private double Vz;

    public TrajectoryPoint(double T, double X, double Y, double Z, double Vx, double Vy, double Vz) {
        this.T = T;
        this.X = X;
        this.Y = Y;
        this.Z = Z;
        this.Vx = Vx;
        this.Vy = Vy;
        this.Vz = Vz;
    }

    public double getT() {
        return this.T;
    }

    public double getX() {
        return this.X;
    }

    public double getY() {
        return this.Y;
    }

    public double getZ() {
        return this.Z;
    }

    public double getVx() {
        return this.Vx;
    }

    public double getVy() {
        return this.Vy;
    }

    public double getVz() {
        return this.Vz;
    }
}