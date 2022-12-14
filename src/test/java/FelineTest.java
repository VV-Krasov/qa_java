import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class FelineTest {
    @Test
    public void eatFoodTest() throws Exception
    {
        List<String> food = List.of("Животные", "Птицы", "Рыба");
        Feline feline = new Feline();
        Assert.assertEquals(feline.eatMeat(), food);
    }

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }
    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
        int expectedResult = 5;
        Assert.assertEquals(feline.getKittens(5), expectedResult);
    }
    @Test
    public void getKittensZeroArgumentsTest() {
        Feline feline = new Feline();
        int expectedResult = 1;
        Assert.assertEquals(feline.getKittens(), expectedResult);
    }
}
