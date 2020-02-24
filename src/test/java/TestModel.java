import com.model.AgeCategory;
import com.model.Model;
import org.junit.*;

public class TestModel {
    private static Model mod;
    @BeforeClass
    public static void runBeforeTests(){
        mod = new Model();
        mod.setAgeCategory(0);
        mod.setBudget(200.0);
        mod.setToysAccordingAge();
        mod.setToysAccordingAgeAndBudget();
    }


    @Test
    public void testSetAgeCategory(){
        Assert.assertEquals(AgeCategory.NEWBORNS,mod.getCategory());
    }
    @Test
    public void testSetBudget(){Assert.assertEquals(200.0,mod.getBudget(),0.0);}
    @Test
    public void testGetToyNames(){Assert.assertEquals("Dolly",mod.getToyNames().get(0));}

}
