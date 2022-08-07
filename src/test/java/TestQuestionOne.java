import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestQuestionOne {
    @Test
    void testGetTarget() {
        QuestionOne q1 = new QuestionOne();
        assertArrayEquals(q1.getIndicesThatSumToTarget(new int[]{2, 7, 11, 15}, 9), new int[]{0, 1});
        assertArrayEquals(q1.getIndicesThatSumToTarget(new int[]{3, 2, 4}, 6), new int[]{1, 2});
        assertArrayEquals(q1.getIndicesThatSumToTarget(new int[]{3, 3}, 6), new int[]{0, 1});
    }
}
