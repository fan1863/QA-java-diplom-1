package praktikum;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class BunTest {


    private final String bunName;
    private final float bunPrice;

    public BunTest(String bunName, int bunPrice) {
        this.bunName = bunName;
        this.bunPrice = bunPrice;
    }



    @Parameterized.Parameters
    public static Object[][] getTextData() {
        return new Object[][] {
                {"black bun", 100},
                {"white bun", 200},
                {"red bun", 300},
                {null, 0},
                {"Parampampams",10},
                {"P",10},
                {"",10},
        };
    }

    @Test
    public void getName() {
        Bun bun = new Bun(bunName, bunPrice);
        assertEquals("Name is incorrect", bunName, bun.getName());

    }


    @Test
    public void getPrice() {
        Bun bun = new Bun(bunName, bunPrice);
        assertEquals("Price is incorrect", bunPrice, bun.getPrice(), 0);
    }
}