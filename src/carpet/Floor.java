package carpet;

public class Floor {

    // Good practice = private
    private double width;
    private double length;

    // Constructor
    public Floor(double width, double length) {

        this.width = (width < 0) ? 0 : width;
        this.length = (length < 0) ? 0 : length;
    }

    public double getArea() {
        return (width * length);
    }

}
