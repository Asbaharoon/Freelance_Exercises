import assign03.Task01;
import org.junit.Assert;
import org.junit.Test;

public class TestTask01 extends Assert {

    int[] A = {1, 2, 3, 4, 3, 2, 1};
    int[] B = {1, 0, 0, 0, 0, 0, 1};
    int[] C = {0, 1, 0, 0, 0, 1, 0};
    Task01 task01 = new Task01();

    @Test
    public void testArrayB(){
        Assert.assertArrayEquals(B, task01.find(A, 1));
    }

    @Test
    public void testArrayC(){
        Assert.assertArrayEquals(C, task01.find(A, 2));
    }
}
