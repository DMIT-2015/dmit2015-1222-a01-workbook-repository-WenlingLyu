package dmit2015.model;
/**
 * This class model a Rectangle shape
 *
 * @AUthor Wenling Lyu
 * @Version 2023.01.20
 *
 */
public class Rectangle {
    //fileds
    /**
     * The length of the rectangle
     */
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

    /**
     * Compute and return the area of the rectangle
     * @return
     */
    public double area(){
        return width*theLength;
    }
    /**
     * Compute and return the perimeter of the rectangle
     * @return
     */
    public double perimeter()
    {
        return 2*width*theLength;
    }
    /**
     * Compute and return the diagonal of the rectangle
     * @return
     */
    public double diagonal(){
        return Math.sqrt(Math.pow(theLength,2)+Math.pow(width,2));
    }
}
