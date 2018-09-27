import org.junit.Test;

import static org.junit.Assert.*;

public class PunktTest {

    @org.junit.Test
    public void getX() {
        Punkt punkt = new Punkt(5,5);
        double xIs = 5;
        assertEquals(xIs, punkt.getX(), 0.001);
    }
    @org.junit.Test
    public void getXnegativ() {
        Punkt punkt = new Punkt(-5, 5);
        double xIs = -5;
        assertEquals(xIs, punkt.getX(), 0.001);
    }

    @Test
    public void name() {

    }

    @Test
    public void getIncorrectX() {
        Punkt punkt = new Punkt(5, 5);
        double xIsNot = 10;
        assertNotEquals(xIsNot, punkt.getY(), 0.001);
    }

    @Test
    public void getIncorrectY() {
        Punkt punkt = new Punkt(5, 5);
        double yIsNot = 10;
        assertNotEquals(yIsNot, punkt.getY(), 0.001);
    }

    @org.junit.Test
    public void getY() {
        Punkt punkt = new Punkt(5,5);
        double yIs = 5;
        assertEquals(yIs, punkt.getX(), 0.001);
    }
    @org.junit.Test
    public void getYnegativ() {
        Punkt punkt = new Punkt(5,-5);
        double yIs = -5;
        assertEquals(yIs, punkt.getY(), 0.001);
    }


    @Test
    public void testCDBP() {
        Punkt punkt1 = new Punkt(5, 5);
        Punkt punkt2 = new Punkt(5, 5);
        double distance = 0;
        CDBP cdbp = new CDBP(punkt1.x, punkt1.y, punkt2.x, punkt2.y);
        assertEquals(distance, cdbp.cDistance(), 0.001);
    }
    @Test
    public void testCDBP2() {
        Punkt punkt1 = new Punkt(5, 10);
        Punkt punkt2 = new Punkt(10, 5);
        double distance = 7.07106781187;
        CDBP cdbp = new CDBP(punkt1.x, punkt1.y, punkt2.x, punkt2.y);
        assertEquals(distance, cdbp.cDistance(), 0.001);
    }

    @Test
    public void testCDBPNegative() {
        Punkt punkt1 = new Punkt(-5, -10);
        Punkt punkt2 = new Punkt(-10, -5);
        double distance = 7.07106781187;
        CDBP cdbp = new CDBP(punkt1.x, punkt1.y, punkt2.x, punkt2.y);
        assertEquals(distance, cdbp.cDistance(), 0.001);
    }
    @Test
    public void testCDBPNegative2() {
        Punkt punkt1 = new Punkt(-5, -55);
        Punkt punkt2 = new Punkt(10, -5);
        double distance = 52.20153254455275;
        CDBP cdbp = new CDBP(punkt1.x, punkt1.y, punkt2.x, punkt2.y);
        assertEquals(distance, cdbp.cDistance(), 0.001);
    }

    @Test
    public void testCDBPnotEqual() {
        Punkt punkt1 = new Punkt(5, 5);
        Punkt punkt2 = new Punkt(5, 5);
        double distance = 5;
        CDBP cdbp = new CDBP(punkt1.x, punkt1.y, punkt2.x, punkt2.y);
        assertNotEquals(distance, cdbp.cDistance(), 0.001);
    }
    @Test
    public void testCDBPnotEqual2() {
        Punkt punkt1 = new Punkt(5, 10);
        Punkt punkt2 = new Punkt(10, 5);
        double distance = 5;
        CDBP cdbp = new CDBP(punkt1.x, punkt1.y, punkt2.x, punkt2.y);
        assertNotEquals(distance, cdbp.cDistance(), 0.001);
    }

    @Test
    public void catchException() {
        Punkt punkt1 = new Punkt(5, 5);
        Punkt punkt2 = null;
        try {
            NewLine newLine = new NewLine(punkt2.y, punkt1.y, punkt2.x, punkt1.x);
        } catch (Exception e){
            return;
        }
        fail();
    }
}