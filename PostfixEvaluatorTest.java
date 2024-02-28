import static org.junit.Assert.*;

import org.junit.Test;

public class PostfixEvaluatorTest {

    @Test
    public void testEvaluatePostfix() {
        assertEquals(6, PostfixEvaluator.evaluate("23*"));
        assertEquals(6, PostfixEvaluator.evaluate("34*2/"));
    }
}
