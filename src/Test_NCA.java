import jdk.internal.cmm.SystemResourcePressureImpl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test_NCA {
    public static void main(String[] args){
        // declaration and instantiation of objects/variables
        WebDriver driver ;
        System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
        driver = new FirefoxDriver();
        String baseUrl = "http://www.nakhonchaiair.com/ncabooking/";
        String expectedTitle = "ระบบสำรองที่นั่งผ่านเว็บไซต์ นครชัยแอร์";
        String actualTitle = "";


        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);


        // get the actual value of the title
        actualTitle = driver.getTitle();
        System.out.println(actualTitle);

        driver.findElement(By.id("thumb0")).click();
        driver.findElement(By.cssSelector("input[value='1']")).click();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }

        driver.findElement(By.name("btn_submit")).click();
        String expectIndexBook = "http://www.nakhonchaiair.com/ncabooking/home.php";
        String actualIndexBook = "";

        driver.findElement(By.className("mybutton"));
        actualIndexBook = driver.getCurrentUrl();

        if (actualIndexBook.contentEquals(expectIndexBook)) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }

        driver.findElement(By.cssSelector("input[value='1']")).click();


        Select dropdown = new Select(driver.findElement(By.id("ID_kn_srcfill")));
        dropdown.selectByVisibleText("กรุงเทพ");
        //dropdown.selectByIndex(1);

        Select source = new Select(driver.findElement(By.name("kn_src1")));
        source.selectByIndex(2);
        //source.selectByVisibleText("กรุงเทพสถานีเดินรถนครชัยแอร์");

        Select direction = new Select(driver.findElement(By.name("kn_desfill")));
        //direction.selectByVisibleText("ขอนแก่น");
        dropdown.selectByIndex(1);



        Select end = new Select(driver.findElement(By.name("kn_des1")));
        end.selectByIndex(1);

        driver.findElement(By.className("myButton1")).click();




        // exit the program explicitly
        System.exit(0);
    }


    }
