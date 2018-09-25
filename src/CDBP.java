public class CDBP {
    //CalculateDistanceBetweenPoints
    double x2 = 0;
    double x1 = 0;
    double y1 = 0;
    double y2 = 0;

    public CDBP(double x1, double y1,double x2,double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double cDistance() {
        return Math.sqrt(((x2 - x1) * (x2 - y2)) + ((y2 - y1) * (y2 - y1)));
    }

}
