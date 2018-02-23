package AlanPhil.tests.J36;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

@SuppressWarnings({"ALL", "CanBeFinal"})
@RunWith(Parameterized.class)
public class TestArrayTasks {

    @SuppressWarnings("CanBeFinal")
    private final ArrayTasks tasks;
    private int[] start;
    private int[] end;
    private int[] badArray;
    private boolean oneFour;

    public TestArrayTasks(int[] array, int[] subArray, int[] badArray, boolean oneFour) {
        this.start = array;
        this.end = subArray;
        this.badArray = badArray;
        this.oneFour = oneFour;
        tasks = new ArrayTasks();
    }

    @Parameterized.Parameters
    public static Collection arrays() {
        int[] array1 = new int[]{1, 4, 1, 4, 1, 1, 1, 4, 4, 1};
        int[] subArray1 = new int[]{1};
        int[] array2 = new int[]{2, 3, 5, 6, 8, 4, 1, 9, 0, 6};
        int[] subArray2 = new int[]{1, 9, 0, 6};
        int[] array3 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int[] subArray3 = new int[]{5, 6, 7, 8, 9, 0};
        int[] badArray1 = new int[]{1, 2, 3, 5, 6, 7, 8, 9, 0, 1};
        int[] badArray2 = new int[]{2, 1, 5, 3, 7, 6, 9, 8, 1, 0};
        int[] badArray3 = new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        return Arrays.asList(new Object[][]{
                {array1, subArray1, badArray1, true},
                {array2, subArray2, badArray2, false},
                {array3, subArray3, badArray3, false}
        });
    }

    @Test
    public void testSubArray() {
        int[] result = tasks.subArray(start);
        assertArrayEquals(end, result);
    }

    @Test
    public void testSubArrayException() {
        int[] result = tasks.subArray(badArray);
        assertEquals(null,result);
    }

    @Test
    public void testOneFour() {
        boolean result = tasks.oneFour(start);
        assertTrue(oneFour == result);
    }
}