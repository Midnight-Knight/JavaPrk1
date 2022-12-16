package ru.mirea.prk31;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class AppTest {

    @BeforeAll
    static void setup(){
        System.out.println("@BeforeAll executed");
    }

    @BeforeEach
    void setupThis(){
        System.out.println("@BeforeEach executed");
    }

    @Tag("BACK")
    @Test
    void testDrinkTypeOne()
    {
        System.out.println("======TEST DrinkType 1 EXECUTED=======");
        for (int i = 0; i < 20; ++i)
        {
            Assertions.assertEquals( DrinkTypeEnum.get(i) , DrinkTypeEnum.get(i));
        }
    }

    @Tag("BACK")
    @Test
    void testDrinkTypeTwo()
    {
        System.out.println("======TEST DrinkType 2 EXECUTED=======");
        Assertions.assertEquals( null , DrinkTypeEnum.get(-1));
    }

    @Tag("BACK")
    @Test
    void testOrderOne()
    {
        System.out.println("======TEST Order 1 EXECUTED=======");
        MenuItem menuItem = new Dish(200, "Борщ", "Борщ с говядиной");
        Customer customer = new Customer(19);
        Order order = new TableOrder(customer);
        Assertions.assertEquals( true , order.add(menuItem));
    }

    @AfterEach
    void tearThis(){
        System.out.println("@AfterEach executed");
    }

    @AfterAll
    static void tear(){
        System.out.println("@AfterAll executed");
    }

}
