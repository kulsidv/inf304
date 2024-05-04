import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {
    @Test
    public void bubbleSortTest() {
        int[] array = {7, 0, 9, 56, 978, 12};
        int[] actual = {0, 7, 9, 12, 56, 978};
        int[] expected = BubbleSort.bubbleSort(array);
        Assert.assertArrayEquals(expected, actual);
    }
}
