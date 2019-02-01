import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class DuplicatesProblemTest {

    public int inputArray[] = {1, 2, 3, 4, 5, 3, 6, 1, 7};
    public int expectedSize = 7;

    @Test
    public void checkDuplicateProblem(){

        List<Integer> result = DuplicatesProblem.printList(inputArray);

        Assert.assertEquals(result.size(), this.expectedSize, "Expected length is: " + this.expectedSize + ". Actual length is: " + result.size());
    }

}