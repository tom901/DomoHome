package app.data;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DimensionTest {
    private Dimension dim2;
    private Dimension dim3;
    private Dimension dim4;
    private double x,y,width,height,radius;

    @Before
    public void setUp() throws Exception {
        x = 15.0; y = 20.0; width = 150; height = 60.0; radius = 5.0;
        dim2 = new Dimension(x,y);
        dim3 = new Dimension(x,y,radius);
        dim4 = new Dimension(x,y,width,height);
    }

    @Test
    public void testForConstructorTwoParams(){
        assertNotNull(dim2);
    }

    @Test
    public void testForConstructorThreeParams(){
        assertNotNull(dim3);
    }
    @Test
    public void testForConstructorFourParams(){
        assertNotNull(dim4);
    }

    @Test
    public void testGetX() throws Exception {
        assertTrue(dim2.getX() == x);
    }

    @Test
    public void testSetX() throws Exception {
        int x2 = 25;
        dim2.setX(x2);
        assertTrue(dim2.getX() == x2);
    }

    @Test
    public void testGetY() throws Exception {
        assertTrue(dim2.getY() == y);
    }

    @Test
    public void testSetY() throws Exception {
        double y2 = 14.2;
        dim2.setY(y2);
        assertTrue(dim2.getY() == y2);
    }

    @Test
    public void testGetWidth() throws Exception {
        assertTrue(dim4.getWidth() == width);
    }

    @Test
    public void testSetWidth() throws Exception {
        double width2 = 154.85;
        dim4.setWidth(width2);
        assertTrue(dim4.getWidth() == width2);
    }

    @Test
    public void testGetHeight() throws Exception {
        assertTrue(dim4.getHeight() == height);
    }

    @Test
    public void testSetHeight() throws Exception {
        double height2 = 584;
        dim4.setHeight(height2);
        assertTrue(dim4.getHeight() == height2);
    }

    @Test
    public void testGetRadius() throws Exception {
        assertTrue(dim3.getRadius() == radius);
    }

    @Test
    public void testSetRadius() throws Exception {
        double radius2 = 5.21;
        dim3.setRadius(radius2);
        assertTrue(dim3.getRadius() == radius2);
    }
}