package ru.mirea.prk32;

import org.junit.jupiter.api.*;
import ru.mirea.prk31.Customer;
import ru.mirea.prk31.Dish;
import ru.mirea.prk31.DrinkTypeEnum;
import ru.mirea.prk31.MenuItem;
import ru.mirea.prk31.Order;
import ru.mirea.prk31.TableOrder;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

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
            Assertions.assertEquals( ru.mirea.prk31.DrinkTypeEnum.get(i) , ru.mirea.prk31.DrinkTypeEnum.get(i));
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
        ru.mirea.prk31.Customer customer = new Customer(19);
        Order order = new TableOrder(customer);
        Assertions.assertEquals( true , order.add(menuItem));
    }

    @Tag("FILE")
    @Test
    void testFILERead() throws FileNotFoundException
    {
        System.out.println("======TEST File Read 1 EXECUTED=======");
        File file = new File("C:\\Users\\Paket\\IdeaProjects\\prk1\\src\\ru\\mirea\\prk32\\TableOrders.txt");
        Scanner scanner = new Scanner(file);
        System.out.println(scanner.nextInt());
        System.out.println(scanner.nextInt());
        System.out.println(scanner.nextInt());
        System.out.println(scanner.nextInt());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.nextInt());
        System.out.println(scanner.next());
        scanner.close();
    }

    @Tag("SCANNER")
    @Test
    void testSCANNERRead()
    {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.println(a);
    }

    @Tag("STRING")
    @Test
    void testSTRINGRead() throws FileNotFoundException
    {
        System.out.println("======TEST STRING 1 EXECUTED=======");
        String a = "'абвгд'";
        System.out.println(a);
        System.out.println(a.length());
        a = a.replace("'", "");
        System.out.println(a);
        System.out.println(a.length());
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
