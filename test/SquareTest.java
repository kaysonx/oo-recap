import me.twu.ooRecap.Rectangle;
import me.twu.ooRecap.Square;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SquareTest {


    public static final double DELTA = 0.001;
    private Square squareWithSize3Point2;
    private Square squareWithSize4;

    @Before
    public void setUp() throws Exception {
        squareWithSize3Point2 = new Square(3.2);
        squareWithSize4 = new Square(4);
     }

    @Test
    public void should_get_area(){
        assertEquals(10.24, squareWithSize3Point2.getArea(), DELTA);
        assertEquals(16, squareWithSize4.getArea(), DELTA);
    }

    @Test
    public void should_get_perimeter() throws Exception {
        assertEquals(12.8, squareWithSize3Point2.getPerimeter(),DELTA);
        assertEquals(16, squareWithSize4.getPerimeter(),DELTA);
    }
}
