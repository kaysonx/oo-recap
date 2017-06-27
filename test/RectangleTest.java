import me.twu.ooRecap.Rectangle;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RectangleTest {

    public static final double DELTA = 0.0001;
    private Rectangle rectangle;

    @Before
    public void setUp() throws Exception {
        rectangle = new Rectangle(4, 5);
    }

    @Test
    public void should_get_area() throws Exception {
        assertEquals(20, rectangle.getArea(), DELTA);
    }

    @Test
    public void should_get_perimeter() throws Exception {
        assertEquals(18, rectangle.getPerimeter(), DELTA);
    }
}
