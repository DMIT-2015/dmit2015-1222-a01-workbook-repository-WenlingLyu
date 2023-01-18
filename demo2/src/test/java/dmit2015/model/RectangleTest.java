package dmit2015.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// this is hard code --- not good
class RectangleTest {

    @Test
    void area_ValidValues_shouldPass() {
        // create a new instance of rectangle and assign it's value
//        Rectangle rectangle = new Rectangle(2,1);
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(2);
        rectangle.setWidth(2);
        // call test method
        // asserEqual(expected value, actual value)
        assertEquals(4,rectangle.area());
    }

    @Test
    void perimeter_VaildValues_shouldPassToo(){
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setWidth(10);
        rectangle1.setLength(10);
        assertEquals(200,rectangle1.perimeter());
    }

    @Test
    void diagonal_Test(){
        Rectangle rectangle2 = new Rectangle();
        rectangle2.setLength(40);
        rectangle2.setWidth(35);
        assertEquals(53.15,rectangle2.diagonal(),0.001);
    }
}