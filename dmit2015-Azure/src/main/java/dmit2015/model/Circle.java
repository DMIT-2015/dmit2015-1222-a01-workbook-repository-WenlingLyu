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
    public double Perimeter(){
        return Math.PI*radius*2;
    }
    public static void main(String[] args){
        // create a new instance of circle but did not assign it's value
    Circle circle1 = new Circle();

    //Assign a value to radius
        // Circle circle1 = new Circle(10);
        //OR
        // Circle circle1 = new Circle();
        // circle1.radius = 10;

    //circle1.radius = 5;
        // % -- followning with the number you wants to get
        // \n start a new line
    System.out.printf("The radius og circle1 is %s\n",circle1.getRadius());
    System.out.printf("The area of circle1 is %.2f(2 decimal),\n",circle1.Area());
    System.out.printf("The perimeter of circle1 is %.2f",circle1.Perimeter());

    try {
        circle1.setRadius(-25);
        System.out.printf("A exception should have been thrown");
    }
    catch (Exception ex){
        System.out.printf(ex.getMessage());
    }

    }

}

