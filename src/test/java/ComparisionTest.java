import org.junit.Assert;
import org.junit.Test;

public class ComparisionTest {
	
	@Test
    public void quantityMeasurement(){
       Measurement obj = new Measurement();
       int feet = 1;
       int inch = obj.comparision(feet);
        Assert.assertEquals(12, inch);
    }
}
