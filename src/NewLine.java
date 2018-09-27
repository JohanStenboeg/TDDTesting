public class NewLine {
    double x2 = 0;
    double x1 = 0;
    double y1 = 0;
    double y2 = 0;

    public NewLine(double x1, double y1,double x2,double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    public double newLine(double x1, double y1,double x2,double y2){
        return (y2-y1)/(x2-x1);

    }
}
