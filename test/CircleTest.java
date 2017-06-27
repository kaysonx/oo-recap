import me.twu.ooRecap.Circle;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class CircleTest {

    public static final double DELTA = 0.0001;
    private Circle circle1;
    private Circle circle2;

    @Before
    public void setUp() throws Exception {
        circle1 = new Circle(5);
        circle2 = new Circle(3);
    }

    @Test
    public void shouldReturnCorrectArea() throws Exception {
        assertEquals(78.5, circle1.getArea(), DELTA);
        assertEquals(28.26,circle2.getArea(), DELTA);
    }

    @Test
    public void shouldReturnCorrectPerimeter() throws Exception {
        assertEquals(31.4, circle1.getPerimeter(),DELTA);
        assertEquals(18.84, circle2.getPerimeter(),DELTA);
    }
}
