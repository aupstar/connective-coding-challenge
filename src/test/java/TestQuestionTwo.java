import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestQuestionTwo {
    @Test
    void testGetMaxWaterLevel() {
        QuestionTwo q2 = new QuestionTwo();
        assertEquals(q2.getMaxWaterLevel(new int[]{1,8,6,2,5,4,8,3,7}), 49);
        assertEquals(q2.getMaxWaterLevel(new int[]{1,1}), 1);
        assertEquals(q2.getMaxWaterLevel(new int[]{4,3,2,1,4}), 16);
        assertEquals(q2.getMaxWaterLevel(new int[]{1,2,1}), 2);
    }
}
