package dmit2015.model;

public class Rectangle {
    //fileds
    private double theLength;
    private double width;

    //instance
    public double getLength(){
        return theLength;
    }

    public double getWidth(){
        return  width;
    }

    public void setLength(double theLength) {
        this.theLength = theLength;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle() {
        this.theLength = theLength;
        this.width = width;
    }

    public double area(){
        return width*theLength;
    }

    public double perimeter()
    {
        return 2*width*theLength;
    }

    public double diagonal(){
        return Math.sqrt(Math.pow(theLength,2)+Math.pow(width,2));
    }
}
