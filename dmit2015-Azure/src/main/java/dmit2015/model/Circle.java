package dmit2015.model;

public class Circle {

    // field
    private double radius;

    // gettter and setter -- can be generate
    // getter
    public double getRadius() {
        return radius;
    }

    //setter
//    public void setRadius(double radius) throws Exception {
//        if(radius <= 0) throw new Exception("Radius must be greater than 0");
//        this.radius = radius;
//    }

    // Runtime exception example
    public void setRadius(double radius){
        if(radius <= 0) throw new RuntimeException("Radius must be greater than 0");
        this.radius = radius;
    }

    // constructor
    public Circle() {
        setRadius(1);
    }
    public Circle(double radius) {
        //this.radius = radius;
        setRadius(radius);
    }

    // method
    public double Area(){
        return Math.PI * radius*radius;
    }
    // method
    public double a(){
        return Math.PI*radius*2;
    }


    
}
